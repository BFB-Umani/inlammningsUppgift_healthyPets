package inlämning_1.Nackademin;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        AnimalFactory djur = new AnimalFactory();
        while(true) {

            String nameInput = JOptionPane.showInputDialog("Vilket djur ska få mat?");
            if(nameInput == null) {
                JOptionPane.showMessageDialog(null, "du har valt att avbryta programmet, programmet avslutas");
                break;
            }
            else {
                nameInput = nameInput.toUpperCase();
                try {
                    djur.getAnimal(nameInput);
                    JOptionPane.showMessageDialog(null, djur.feed());
                    break;

                }catch(IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, "Det finns inget djur med det namnet här");
                }
            }
        }
    }
}
