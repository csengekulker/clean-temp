/*
 * Nagy János, 2022-11-12
 * Copyright (c) 2022, Nagy János
 * Licenc: MIT
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// TODO: method names
// TODO: variable names

public class Temp {
    ArrayList<Double> b;

    // initial array of temp values
    public Temp() {
        Double[] z = { 2.5, 2.8, 1.2, 0.5, -1.1 };
        this.b = new ArrayList<>(Arrays.asList(z));        
    }

    // i() called here in loop
    public void c() {
        String t = "";
        while(!t.equals("vege")) {
            t = i();
            lep(t);
        }
    }

    // gets user input once
    public String i() {
        Scanner r = new Scanner(System.in);
        System.out.print("Hőmérséklet: ");
        return r.nextLine();
    }
    
    // next input OR output log on condition
    public void lep(String tempStr) {
        if (!tempStr.equals("vege")) {
            output(tempStr);
        }else {
            wl();
        }
    }    

    // adds input double to array on condition
    public void output(String tempStr) {
        if (cik(tempStr)) {
            double temp = Double.parseDouble(tempStr);
            b.add(temp);
        }else {
            System.err.println("Hiba! Számot kell beírni!");
        }
    }

    // TODO: a == tempStr (?)
    
    // validates input format
    public boolean cik(String a) {
        // TODO: one return statement only
        if (a.matches("[0-9.]+")) {
            return true;
        }else {
            return false;
        }
    }

    // prints out the array elements (output log)
    public void wl() {
        for (double z : this.b) {
            System.out.print(z + " ");
        }
        System.out.println();
    }
}
