package Module2_NguyenVanKhanh_casestudy.Commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String ID_REGEX_VILLA = "^SVVL-[0-9]{4}$";
    private static final String ID_REGEX_HOUSE ="^SVHO-[0-9]{4}$";
    private static final String ID_REGEX_ROOM ="^SVRO-[0-9]{4}$";
    private static final String TENDICHVU_REGEX ="^([A-Z])([a-z]+)(\\s([a-z]+))*$";
    private static final String DIENTICHSUDUNG_DIENTICHHOBOI_REGEX="^([0-9]*[1-9][0-9]*(\\.[0-9]+)?|[0]+\\.[0-9]*[1-9][0-9]*)$";
    private static final String CHIPHITHUE_REGEX ="^\\d+$";

    public static boolean valid_Id_Villa(String regex){
        Pattern pattern = Pattern.compile(ID_REGEX_VILLA);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean valid_Id_House(String regex){
        Pattern pattern = Pattern.compile(ID_REGEX_HOUSE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean valid_Id_Room(String regex){
        Pattern pattern = Pattern.compile(ID_REGEX_ROOM);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean valid_Tendichvu(String regex){
        Pattern pattern = Pattern.compile(TENDICHVU_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean valid_Dientichsudung_hoboi(String regex){
        Pattern pattern = Pattern.compile(DIENTICHSUDUNG_DIENTICHHOBOI_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean valid_Chiphithue(String regex){
        Pattern pattern = Pattern.compile(CHIPHITHUE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

