package Thi.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String TEN_REGEX = "^([a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]+)(\\s([a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]+))*$";
    private static final String SDT_REGEX = "^[0-9]{10}";
    private static final String GENDER_REGEX = "^(NỮ|NAM|Không xác định|Nữ|Nam|KHÔNG XÁC ĐỊNH)$";
    private static final String EMAIL_REGEX = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
    private static final String TENDICHVU_REGEX = "^([A-Z])([a-z]+)(\\s([a-z]+))*$";
    public static boolean valid_Ten(String regex) {
        Pattern pattern = Pattern.compile(TEN_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
    public static boolean valid_Tendichvu(String regex) {
        Pattern pattern = Pattern.compile(TENDICHVU_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_Sdt(String regex) {
        Pattern pattern = Pattern.compile(SDT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean valid_Email(String regex) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }

    public static boolean valid_Gioitinh(String regex) {
        Pattern pattern = Pattern.compile(GENDER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
