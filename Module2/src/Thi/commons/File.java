package Thi.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class File {
    public static void writeCSV(Object object, String path) throws IOException {
        java.io.File file = new java.io.File(path);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter buffWrite = new BufferedWriter(fileWriter);
        buffWrite.write(object.toString());
        buffWrite.flush();
        buffWrite.close();
    }
    public static List<String> readCSV(String path) throws IOException {
        List<String> arrList;
        java.io.File file = new java.io.File(path);
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
