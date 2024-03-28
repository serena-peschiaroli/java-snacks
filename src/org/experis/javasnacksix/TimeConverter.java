package org.experis.javasnacksix;

import java.util.Scanner;

/*Scrivere un programma che dati dei secondi li converta in ore,
minuti, secondi e mostri a video la stringa generata nel formato “hh:mm:ss”*/
public class TimeConverter {
    public static void main(String[] args) {
        //creare scanner
        Scanner scanner = new Scanner(System.in);
        //chieddere input ad utente
        System.out.println("Enter the total number of seconds: ");
        /*minuti: dividere il totale dei secondi per 3600
          minuti: resto dalla divisione / 60
          secondi: resto dalla divisione */

        int totalSeconds = Integer.parseInt(scanner.nextLine());

        // calcolare ore, minuti, secondi
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // formattare e stampare il risultato
        String timeFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("converted time (hh:mm:ss): " + timeFormatted);

        scanner.close();
    }
}
