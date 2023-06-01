package Kiosk03;

import java.util.ArrayList;

public class ArrayListMenu {

    public static void main(String[] args) {


        ArrayList<ArrayList<String>> arrayMenus = new ArrayList<>();

        ArrayList<String> arrayBurger = new ArrayList<>();
        arrayBurger.add("빅맥");
        arrayBurger.add("더블불고기");
        arrayBurger.add("1955");
        arrayMenus.add(arrayBurger);

        ArrayList<String> arrayDrinks = new ArrayList<>();
        arrayDrinks.add("콜라");
        arrayDrinks.add("사이다");
        arrayDrinks.add("환타");
        arrayMenus.add(arrayDrinks);

        ArrayList<String> arraySides = new ArrayList<>();
        arraySides.add("감자튀김");
        arraySides.add("치즈스틱");
        arraySides.add("콘샐러드");
        arrayMenus.add(arraySides);

        System.out.println(arrayMenus.get(0).get(1));
    }
}