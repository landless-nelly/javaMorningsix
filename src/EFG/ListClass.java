package EFG;

import java.util.ArrayList;

public class ListClass {
    public static void main(String[] args) {
        ArrayList<Item> list;
        list = new ArrayList<>();
        Item kitu;
        kitu = new Item("soap",1,800);
        list.add(kitu);

        kitu = new Item("kiwi",20,10);
        list.add(kitu);

        kitu =new Item("oil",30,500);
        list.add(kitu);

        System.out.println(list.toString());


    }
}
