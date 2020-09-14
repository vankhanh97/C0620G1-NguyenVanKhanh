package Module2_NguyenVanKhanh_casestudy.Commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String ID_REGEX_VILLA = "^SVVL-[0-9]{4}$";
    private static final String ID_REGEX_HOUSE = "^SVHO-[0-9]{4}$";
    private static final String ID_REGEX_ROOM = "^SVRO-[0-9]{4}$";
    private static final String TENDICHVU_REGEX = "^([A-Z])([a-z]+)(\\s([a-z]+))*$";
    private static final String DIENTICHSUDUNG_DIENTICHHOBOI_REGEX = "^([0-9]*[1-9][0-9]*(\\.[0-9]+)?|[0]+\\.[0-9]*[1-9][0-9]*)$";
    private static final String CHIPHITHUE_REGEX = "^\\d+$";
    private static final String HOVATEN_REGEX = "^([a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]+)(\\s([a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]+))*$";
    private static final String NGAYSINH_REGEX = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";
    private static final String GENDER_REGEX = "^(NỮ|NAM|Không xác định|Nữ|Nam|KHÔNG XÁC ĐỊNH)$";
    private static final String CMND_REGEX = "^[0-9]{9}";
    private static final String SDT_REGEX = "^[0-9]{10}";
    private static final String EMAIL_REGEX = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
private static final String SONGUYENDUONG_REGEX = "^[0-9]";
    public static boolean valid_soNguyenDuong(String regex) {
        Pattern pattern = Pattern.compile(SONGUYENDUONG_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean valid_Email(String regex) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean valid_Sdt(String regex) {
        Pattern pattern = Pattern.compile(SDT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean valid_CMND(String regex) {
        Pattern pattern = Pattern.compile(CMND_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_Gioitinh(String regex) {
        Pattern pattern = Pattern.compile(GENDER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_NgaySinh(String regex) {
        Pattern pattern = Pattern.compile(NGAYSINH_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_Id_Villa(String regex) {
        Pattern pattern = Pattern.compile(ID_REGEX_VILLA);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_Id_House(String regex) {
        Pattern pattern = Pattern.compile(ID_REGEX_HOUSE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_Id_Room(String regex) {
        Pattern pattern = Pattern.compile(ID_REGEX_ROOM);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_Tendichvu(String regex) {
        Pattern pattern = Pattern.compile(TENDICHVU_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_Dientichsudung_hoboi(String regex) {
        Pattern pattern = Pattern.compile(DIENTICHSUDUNG_DIENTICHHOBOI_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_Chiphithue(String regex) {
        Pattern pattern = Pattern.compile(CHIPHITHUE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_Hovaten(String regex) {
        Pattern pattern = Pattern.compile(HOVATEN_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

