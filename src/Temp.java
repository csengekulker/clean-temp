/*
 * Nagy János, 2022-11-12
 * Copyright (c) 2022, Nagy János
 * Licenc: MIT
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Temp {
    ArrayList<Double> b;

    public Temp() {
        Double[] z = { 2.5, 2.8, 1.2, 0.5, -1.1 };
        this.b = new ArrayList<>(Arrays.asList(z));        
    }

    public void c() {
        String t = "";
        while(!t.equals("vege")) {
            t = i();
            lep(t);
        }
    }

    public String i() {
        Scanner r = new Scanner(System.in);
        System.out.print("Hőmérséklet: ");
        return r.nextLine();
    }
    
    public void lep(String tempStr) {
        if (!tempStr.equals("vege")) {
            output(tempStr);
        }else {
            wl();
        }
    }    

    public void output(String tempStr) {
        if (cik(tempStr)) {
            double temp = Double.parseDouble(tempStr);
            b.add(temp);
        }else {
            System.err.println("Hiba! Számot kell beírni!");
        }
    }
    
    public boolean cik(String a) {
        if (a.matches("[0-9.]+")) {
            return true;
        }else {
            return false;
        }
    }

    public void wl() {
        for (double z : this.b) {
            System.out.print(z + " ");
        }
        System.out.println();
    }
}
