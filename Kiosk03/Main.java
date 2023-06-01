package Kiosk03;

public class Main {

    public static void main(String[] args) {

        Hello hello = new Hello("민재 : ");
        Menu menu = new Menu();

        hello.sayHello();
        hello.togo();

        menu.menus();
        }
    }
