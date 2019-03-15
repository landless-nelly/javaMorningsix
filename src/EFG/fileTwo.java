package EFG;

import javax.swing.*;
import java.util.ArrayList;

public class fileTwo {
    public static void main(String[] args) {
        ArrayList<fileOne> list;
        list = new ArrayList<>();
        fileOne person;

        person = new fileOne("nelly","nellyndunge34@gmail.com","1234566");
        list.add(person);

        person = new fileOne("judy","judymbeke@gmail.com","678909");
        list.add(person);

        person = new fileOne("caleb","aleb@gmail.com","45678");
        list.add(person);

        person =new fileOne("dan","dan@gmail.com","opopiopop");
        list.add(person);
        JOptionPane.showInputDialog(null,list.toString());
    }
}
