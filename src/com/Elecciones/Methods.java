package com.Elecciones;

import java.util.Scanner;

public class Methods {

    public static void showResults(){

    }

    public static void wipeConsole(){
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

    }
    public static void pressEnter(Scanner scanner){
        System.out.println("\nPresiona ENTER para continuar ...");
        scanner.hasNextLine();

    }

}
