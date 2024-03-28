package org.experis.javasnacktwo;

import java.util.Random;

/* Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome. */
public class NameGenerator {
    public static void main(String[] args) {

        //inizializzo array
        String [] firstNames = {"Linda", "John", "Maria", "Carlo", "Giovanni", "Francesca", "Pedro", "Ivan", "Sofia" };
        String [] lastNames = {"Bianchi", "Johnson", "Rossi", "Brown", "Pascale", "Garcia", "Miller", "Chernov", "Allende"};

        //inizializzo array degli invitat
        String[] invitees = new String[10];

        //classe random
        Random randomGenerator = new Random();

        //conttore
        int count = 0;
        //ciclo while, mentre count è meno della lunghezza di invitees
        while(count < invitees.length){
            //genera nome random
            int randomNameIndex = randomGenerator.nextInt(firstNames.length);
            //genera cognome random
            int randomSurnameIndex = randomGenerator.nextInt(lastNames.length);
            //nome completo = primo nome + cognome
            String fullName = firstNames[randomNameIndex] + " " + lastNames[randomSurnameIndex];


            //controlla se il nome è gia presente nella lista per evitare duplicati

            boolean isDuplicate = false;
            for (int i = 0; i < count ; i++) {
                if(invitees[i].equals(fullName)){
                    isDuplicate = true;
                    break;
                }
                
            }
            //se non duplicato, aggiunge all'array ed aumenta il contayore
            if(!isDuplicate){
                invitees[count] = fullName;
                count++;
            }

        }
        //stampa la lista degli invitati:
        System.out.println("Lista di Invitati: ");
        for (String invitee : invitees) {
            System.out.println(invitee);
        }


    }
}
