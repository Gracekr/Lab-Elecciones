package com.Elecciones;

import java.util.Scanner;

public class Polls {
    public static void main(String[] args) {

        Partido Partido_1 = new Partido("P1");
        Partido Partido_2 = new Partido("P2");
        Partido Partido_3 = new Partido("P3");
        Partido Partido_4 = new Partido("P4");
        Partido Partido_5 = new Partido("P5");

        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Hoy son las elecciones!");
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
        do {
            System.out.println("\nElige el número del partido de tu preferencia");
            System.out.println("--Candidatos--");
            System.out.println("1. P1 \n2. P2 \n3. P3 \n4. P4 \n5. P5");


            int option = scanner.nextInt();
            scanner.nextLine();

                if (option <= 5 && option >= 1) {

                        switch (option) {
                        case 1:
                            System.out.println("Has votado a " + Partido_1.getName());
                            Partido_1.setShare(p1++);
                            break;
                        case 2:
                            System.out.println("Has votado a " + Partido_2.getName());
                            Partido_2.setShare(p2++);
                            break;
                        case 3:
                            System.out.println("Has votado a " + Partido_3.getName());
                            Partido_3.setShare(p3++);
                            break;
                        case 4:
                            System.out.println("Has votado a " + Partido_4.getName());
                            Partido_4.setShare(p4++);
                            break;
                        case 5:
                            System.out.println("Has votado a " + Partido_5.getName());
                            Partido_2.setShare(p5++);
                            break;
                        default:
                            System.out.println("Introduce un candidato válido");
                    }

                    System.out.println("¿Actualizar resultados? s/n");

                    String update = scanner.nextLine();
                    if (update.equals("s")) {
                        System.out.println("\n Así van los resultados:");
                        System.out.println("Partido 1 " + Partido_1.getShare() + " votos");
                        System.out.println("Partido 2 " + Partido_2.getShare() + " votos");
                        System.out.println("Partido 3 " + Partido_3.getShare() + " votos");
                        System.out.println("Partido 4 " + Partido_4.getShare() + " votos");
                        System.out.println("Partido 5 " + Partido_5.getShare() + " votos");

                    } else {
                        Methods.wipeConsole();
                    }

                }
                   } while (scanner.hasNextInt());





        scanner.close();


    }
}
