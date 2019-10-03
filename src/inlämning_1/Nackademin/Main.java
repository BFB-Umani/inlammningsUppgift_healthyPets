package inlämning_1.Nackademin;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        AnimalFactory animal = new AnimalFactory();
        while(true) {

            String nameInput = JOptionPane.showInputDialog("Vilket djur ska få mat?");
            if(nameInput == null) {
                JOptionPane.showMessageDialog(null, "du har valt att avbryta, programmet avslutas");
                break;
            }
            else {
                // gör strängen till uppercase för att kunna jämföra med Enum;en.
                nameInput = nameInput.toUpperCase();
                try {
                    animal.getAnimal(nameInput);
                    JOptionPane.showMessageDialog(null, animal.feed());

                }catch(IllegalArgumentException ex) {
                    // behåller första bokstaven i namnet som uppercase och gör om resten av strängen till lowercase.
                    nameInput = nameInput.substring(0, 1) + nameInput.substring(1).toLowerCase();
                    JOptionPane.showMessageDialog(null, "Det finns inget djur med det namnet " + nameInput + " här");
                }
            }
        }
    }
}
