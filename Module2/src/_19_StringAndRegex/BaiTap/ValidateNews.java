package _19_StringAndRegex.BaiTap;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi/diem-nong.htm");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
          //  System.out.println(content);
            // remove all new line
            content = content.replaceAll("\\R", "");
           // System.out.println(content);
            // regex
            Pattern p = Pattern.compile("<h3 class='news-item__title'> {20}<a {2}data-utm=\"(.*?)\" {2}href=\"(.*?)\" {2}title=\"(.*?)\"");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(3));
            }
// close scanner
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



