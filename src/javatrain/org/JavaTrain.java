package javatrain.org;

import java.text.DecimalFormat;
import java.util.Scanner;


import static java.lang.Integer.parseInt;

public class JavaTrain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* DOBBIAMO CHIEDERE ALL'UTENTE L'ETà E IL NUMERO DI CHILOMETRI CHE VUOLE PERCORRERE */

        System.out.print("Age user: ");
        int ageUser = Integer.parseInt(scan.nextLine());

        System.out.println("Km: ");
        int km = Integer.parseInt(scan.nextLine());

        /* CALCOLARE IL PREZZO DEL BIGLIETTO */

        double totalPrice = (0.21 * km);

                // Stampa il risultato
        System.out.println("The price of ticket is : " + totalPrice);



        /* CALCOLARE IL PREZZO DEL BIGLIETTO IN BASE AGLI SCONTI */

        if (ageUser < 18) {
            totalPrice -= totalPrice * 0.2;
        }

        else if (ageUser > 65) {
            totalPrice -= totalPrice * 0.4;
        }

        /*PREZZO FINALE CON MASSIMO DUE DECINALI*/

        // Creare un oggetto DecimalFormat con il formato desiderato
        DecimalFormat formatoDecimali = new DecimalFormat("#.##");

        // Formattare il prezzo finale con al massimo due decimali
        String totalPriceNew = formatoDecimali.format(totalPrice);

        // Stampa il risultato
        System.out.println("Total Price discounted is : $" + totalPriceNew );
    }
}

