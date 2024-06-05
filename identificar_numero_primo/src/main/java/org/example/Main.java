package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean primo = true;
        int num = 0;
        System.out.println("Ingrese un numero>> ");
        num = reader.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("No es numero primo");
        } else {
            System.out.println("Es numero primo");
        }
    }
}
