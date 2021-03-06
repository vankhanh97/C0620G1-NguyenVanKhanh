package com.example.blog_app.config;


import com.example.blog_app.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private DataSource dataSource;


    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // Sét đặt dịch vụ để tìm kiếm User trong Database.
        // Và sét đặt PasswordEncoder.
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // csrf
        http.csrf().disable();

        // login
        http.formLogin()
                .loginProcessingUrl("/checkLogin")
                .loginPage("/login")
        // login successful
                .defaultSuccessUrl("/blog/")
        // login failed
                .failureUrl("/?error=true")
        // setting username, password
                .usernameParameter("username")
                .passwordParameter("password")
        // logout
                .and().logout().logoutUrl("/logout")
        // logout successful
                .logoutSuccessUrl("/");

        // authorization
        // guest
        http.authorizeRequests().antMatchers("/","/logout").permitAll();

        // user
//        http.authorizeRequests().antMatchers("/", "/student", "/student/detail").hasRole("USER");
//        http.authorizeRequests().antMatchers("/", "/student", "/student/detail")
//                .access("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')");
        http.authorizeRequests().antMatchers( "/blog/", "/blog/Home","/blog/detail")
                .hasAnyRole("USER","ADMIN");

        // admin
        http.authorizeRequests().antMatchers( "/blog/create").hasRole("ADMIN");

        // no permission
        http.exceptionHandling().accessDeniedPage("/blog/403");

        // remember me
        http.rememberMe()
                .rememberMeParameter("rememberMe")
                .rememberMeCookieName("rememberMeCookie")
                .tokenValiditySeconds(15);
//                .tokenRepository(this.persistentTokenRepository());
    }

    // Token stored in Table - persistent_logins
//    @Bean
//    public PersistentTokenRepository persistentTokenRepository() {
//        JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
//        db.setDataSource(dataSource);
//        return db;
//    }

}
