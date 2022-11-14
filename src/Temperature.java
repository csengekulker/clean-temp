/*
 * Balogh Csenge, 2022-11-14
 * Copyright (c), Balogh Csenge
 * Licenc: MIT
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Temperature {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> tempList;

    public Temperature() {

        Double[] initialList = { 0.0, 0.0, 0.0, 0.0 };
        tempList = new ArrayList<>(Arrays.asList(initialList));        
    }

    public void init() {

        while(true) {
            String inputString = getUserInput();

            if (inputString == "vege") {
                break;
            }

            addOrLog(inputString);
        }
    }

    public String getUserInput() {

        System.out.print("Hőmérséklet: ");
        String inputString = scanner.nextLine();
        return inputString;

    }
    
    // method not needed
    public void addOrLog(String tempStr) {
        if (!tempStr.equals("vege")) {
            addToList(tempStr);
        }else {
            logOutput();
        }
    }    

    // TODO: trycatch(?)
    public void addToList(String tempString) {
        if (isValidInput(tempString)) {
            double tempDouble = Double.parseDouble(tempString);
            tempList.add(tempDouble);
        }else {
            System.err.println("Hiba! Számot kell beírni!");
        }
    }
    
    public boolean isValidInput(String a) {

        boolean valid = false;

        if (a.matches("[0-9.]+")) {
            valid = true;
        }
        return valid;
    }

    public void logOutput() {
        for (double temp : tempList) {
            System.out.print(temp + " ");
        }
        System.out.println();
        System.exit(0);
    }
}
