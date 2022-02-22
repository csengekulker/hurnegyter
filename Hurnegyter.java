/*
* File: Hurnegyter.java
* Author: Balogh Csenge
* Copyright: 2022, Balogh Csenge
* Group: Szoft_I_N
* Date: 2022_02_22
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class Hurnegyter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tBalogh Csenge\n\tSzoft_I_N\n\t2022.02.22");

        System.out.print("A oldal > ");
        double a = sc.nextDouble();
        System.out.print("B oldal > ");
        double b = sc.nextDouble();
        System.out.print("C oldal > ");
        double c = sc.nextDouble();
        System.out.print("D oldal > ");
        double d = sc.nextDouble();

        double halfPerimeter = (a + b + c + d) / 2;

         // System.out.println(halfPerimeter);
    }
}