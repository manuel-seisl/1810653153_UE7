package Aufgabe2;

import javax.swing.*;

public class Main
{

    public static void main(String[] args){

        while(true){

            try {

                int zahl1 = getUserInput();

                System.out.println("Die eingegebene Zahl ist: " + zahl1);

                break;

            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Sie haben einen String eingegeben!", "Fehler", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    public static int getUserInput() throws NumberFormatException {
        return Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl eingeben:"));
    }

}
