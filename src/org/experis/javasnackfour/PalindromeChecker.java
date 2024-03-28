package org.experis.javasnackfour;

import java.util.Scanner;

//Data in input una stringa verificare se è palindroma
public class PalindromeChecker {
    public static void main(String[] args) {
        //creo scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Text to check for a palindrome: ");

        //inizializzare userInput
        String userInput = scan.nextLine();
        
        //normalizzare input
        String normalizedInput = userInput.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Indice che parte dall'inizio della stringa
        //int left = 0;
        // Indice che parte dalla fine della stringa
        //int right = normalizedInput.length() - 1;

        boolean isPalindrome = true;
        /*viene confrontato il char alla posizione i della prima metà con il carattere
         corrispondente alla fine della stringa rimanente, -1 -i*/
        for (int i = 0; i < normalizedInput.length() / 2; i++) {
            if(normalizedInput.charAt(i) != normalizedInput.charAt(normalizedInput.length() - 1 - i)){
                isPalindrome = false;
                break;
            }

            
        }
        if(isPalindrome){
            System.out.println(userInput + " it's a palindrome");
        }else{
            System.out.println(userInput + " it's not a palindrome");
        }
        //chiudere lo scanner
        scan.close();

    }
}
