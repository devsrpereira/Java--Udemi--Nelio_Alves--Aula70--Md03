package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = s.nextDouble();

        double c = Calculator.circunference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circunfence: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
    }
}
