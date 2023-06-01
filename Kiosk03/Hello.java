package Kiosk03;

import java.util.Scanner;

public class Hello {
    public Scanner sc = new Scanner(System.in);
    public Hello(String staff){
        this.staff = staff;
    }
    private String staff;
    public void sayHello(){

        System.out.println(staff + "어서오세요. 맥도날드입니다!");
    }
    public boolean togo() {
        System.out.println("포장이세요?");
        String result = sc.next();

        if (result.equals("네")) {
            return true;
        } else {
            return false;
        }
    }
}
