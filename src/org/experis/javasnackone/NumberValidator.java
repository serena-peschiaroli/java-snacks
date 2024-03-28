package org.experis.javasnackone;

import java.util.Scanner;

/* Chiedi all’utente di continuare ad inserire un numero pari compreso tra 10 e 20.
Se il numero non corrisponde alla richiesta continuare a chiederlo fino a che non viene inserito un numero valido. */
public class NumberValidator {
    public static void main(String[] args) {
        //inizializzo lo scanner
        Scanner scan  = new Scanner(System.in);

        //viariabile booleana per tracciare input
        boolean isValid = false;

        //loop per iterare gli input
        while(!isValid){
            System.out.println("Please insert an even number between 10 and 20: ");
            int userInput = Integer.parseInt(scan.nextLine());

            //verifica se l'userInput è compreso tra 10 e venti ed è pari

            if(userInput >= 10 && userInput <= 20 && userInput %2 == 0){
                System.out.println(userInput + " is a valid number.");
                isValid = true;
            } else {
                System.out.println(userInput + " is not a valid number. Try again: ");
            }
        }

    }
}
