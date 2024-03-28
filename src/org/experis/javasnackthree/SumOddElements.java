package org.experis.javasnackthree;

//Snack3
//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

import java.util.Random;
import java.util.Scanner;

public class SumOddElements {
    public static void main(String[] args) {

        //creare scanner
        Scanner scan = new Scanner(System.in);
        //chiedere ad utente di quanti elementi vuole array
        System.out.println("Please choose how many elements: ");
        //variabile size
        int size = Integer.parseInt(scan.nextLine());

        Random random = new Random();

        //inizializzare array
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length ; i++) {
            //crea numeri random da 1 a 100 aggiungendo 1 per evitare lo 0
            numbers[i] = 1 + random.nextInt(100);
            System.out.println("index " + i + ": " + numbers[i]);

        }

        //variabile x tenere traccia della soma

        int sum = 0;
        System.out.println("\nnumbers in odd position: ");
        //ciclo per iterare gli array e sommare quelli in posizione dispari
        for (int i = 0; i < numbers.length ; i++) {
            if(i % 2 == 0){

                sum += numbers[i];
                //stampa elementi in posizione dispari
                System.out.println("index " + i + " (value: " + numbers[i] + ")");
            }

        }

        // Stampa l'array per riferimento
        System.out.print("array: ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }

        // Stampa il risultato
        System.out.println("The sum of elements in odd position is: " + sum);



    }
}
