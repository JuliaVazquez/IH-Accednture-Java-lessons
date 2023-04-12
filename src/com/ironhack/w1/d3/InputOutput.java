package com.ironhack.w1.d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
//      INPUT / OUTPUT

        //System.out.println("Prueba de salida normal por consola");
        //System.err.println("Prueba de salida de error por consola");

    // SCANNER CLASS
        Scanner scanner = new Scanner(System.in);

        String name;
        do {
            System.out.println("Please write your name");
            name = scanner.nextLine();
        } while (name.length() < 3);
        System.out.println("Hello " + name);

        //Pedir usuario edad si no pone numero que vuelva a escribir
        //No me saleeeee, el ejemplo fue solo if else
        /*System.out.println("Write age");
        String age = scanner.nextLine();

        do {
            System.out.println("Please write your age");
            age = scanner.nextLine();
        } while (name.matches("\\d+"));
        System.out.println("Your age is " + age);

        /*do {
            System.out.println("Please write your age:");
            if (scanner.hasNextInt()){
                int age = scanner.nextInt();
                System.out.println("Your age is: " + age);
            }


        } while (scanner.hasNextInt() == false);
*/


        scanner.close();

//      FILE HANDLING  -  FILE CLASS

        String filePath = "src/com/ironhack/w1/d3/fichero.txt";

        File file = new File(filePath);
        if (file.createNewFile()){
            System.out.println("El archivo se ha creado");
        } else {
            System.out.println("El archivo ya existía");
        }

        FileWriter fileWriter = new FileWriter(filePath,true);
        fileWriter.write("Esto es una linea");

        fileWriter.close();

        Scanner fileScanner = new Scanner(file);
        String str = "";
        while (fileScanner.hasNextLine()){
            str += fileScanner.nextLine();
            System.out.println(str);
        }

        fileScanner.close();





    }
}



