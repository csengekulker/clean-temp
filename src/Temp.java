/*
 * Nagy János, 2022-11-12
 * Copyright (init) 2022, Nagy János
 * Licenc: MIT
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// TODO: method names
// TODO: variable names

public class Temp {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> tempList;

    // initial array of temp values
    public Temp() {

        Double[] initialList = { 0.0, 0.0, 0.0, 0.0 };
        this.tempList = new ArrayList<>(Arrays.asList(initialList));        
    }

    public void init() {
        String inputString = "";
        // TODO: do, while, break (?)
        while(true) {
            inputString = getUserInput();

            if (inputString == "vege") {
                break;
            }
            
            addOrLog(inputString);
            
        }
    }

    // gets user input once
    public String getUserInput() {

        System.out.print("Hőmérséklet: ");
        String inputString = scanner.nextLine();
        return inputString;

    }
    
    // next input OR output log on condition
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
    
    // validates input format
    public boolean isValidInput(String a) {

        boolean valid = false;

        if (a.matches("[0-9.]+")) {
            valid = true;
        }
        return valid;
    }

    public void logOutput() {
        for (double temp : this.tempList) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}
