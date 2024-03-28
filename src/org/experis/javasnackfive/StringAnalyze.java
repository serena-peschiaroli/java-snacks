package org.experis.javasnackfive;

import java.util.Scanner;

/* Data una stringa in input mostrare a video quanti caratteri alfabetici contiene,
quanti numeri e quanti simboli non alfanumerici.*/
public class StringAnalyze {
    public static void main(String[] args) {
        //creare scanner
        Scanner scan = new Scanner(System.in);

        //richeista di input
        System.out.println("Please enter a string: ");

        //normalizzazione user input levando spazi e tutto  minuscolo
        String userInput = scan.nextLine().trim().toLowerCase().replace(" ", "");

        //inizializzazione dei contatori per lettere, numeri, simboli
        int letterCount = 0, numberCount = 0, symbolCount = 0;

        //iterazione di ogni carattere dellla stringa
        for (int i = 0; i < userInput.length() ; i++) {
            char character = userInput.charAt(i);
            //verifica se carattere è una lettera (valori ASCII)
            if(character >= 'a'  && character <= 'z' ){

                letterCount++;
                //altrimenti verifica se è numero
            } else if (character >= '0' && character <= '9') {
                numberCount++;
                //altrimenti, è un simbolo
            }else{
                symbolCount++;
            }

        }

        System.out.println("letters: " + letterCount + ", numbers: " + numberCount + ", symbols: " + symbolCount);

        


        //chiudere scanner
        scan.close();
    }
}
