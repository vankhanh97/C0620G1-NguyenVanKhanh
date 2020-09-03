package Module2_NguyenVanKhanh_casestudy.Commons;


import Module2_NguyenVanKhanh_casestudy.Models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtils {
    public static void writeCSV(Object object, String path) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter buffWrite = new BufferedWriter(fileWriter);
        buffWrite.write(object.toString());
        buffWrite.flush();
        buffWrite.close();
    }


    public static List<String> readCSV(String path) throws IOException {
        List<String> arrList;
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] temp;
        arrList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            arrList.addAll(Arrays.asList(temp));
        }
        bufferedReader.close();
        return arrList;
    }
}

