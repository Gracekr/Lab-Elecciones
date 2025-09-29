import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[] abc=new char[26];

        for (int i = 0; i < abc.length; i++) {
           abc[i]=(char) ('a' + i);


            System.out.println(abc[i]);
        }
        System.out.println('\n');
        for (int j = 0; j < abc.length; j++) {

            abc[j]=(char)('A'+j);

            System.out.println(abc[j]);
        }

        Scanner num=new Scanner(System.in);
        System.out.println("Introduce un número entre 33-126");
        int input= num.nextInt();
        char charfromInt=(char)input;

        System.out.println("Eres el usuario número "+input+ " y te corresponde este caracter: "+charfromInt);
    num.close();



    }
}
