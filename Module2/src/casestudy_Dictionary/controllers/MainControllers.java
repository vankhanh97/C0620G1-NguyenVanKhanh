package casestudy_Dictionary.controllers;

import casestudy_Dictionary.functions.Define;
import casestudy_Dictionary.functions.Drop;
import casestudy_Dictionary.functions.Export;
import casestudy_Dictionary.functions.LookUp;


import java.util.Scanner;

public class MainControllers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Action: \n1. Lookup \n2. Define \n3. Drop \n4. Export");

        int selectAction;
        do {
            System.out.println("Enter the action: ");
            selectAction = scanner.nextInt();
            switch (selectAction) {
                case 1:
                    LookUp.lookUp();
                    break;
                case 2:
                    System.out.println("Enter the keyword you want to add define: ");
                    Define.define();
                    break;
                case 3:
                    Drop.drop();
                    break;
                case 4:
                    Export.export();
                    break;
            }
        } while (selectAction < 1 || selectAction > 4);
    }
}
