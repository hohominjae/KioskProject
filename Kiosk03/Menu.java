package Kiosk03;

import java.util.Scanner;

public class Menu {

    public void menus() {
        Scanner sc = new Scanner(System.in);

        int menu = 99; //메뉴 인덱스
        int menuNum01 = 0; //메뉴의 갯수
        int menuNum02 = 0;
        int menuNum03 = 0;
        int a = 0; // 음식의 값을 저장하는 변수
        int b = 0;
        int c = 0;
        int price = 0; // 총 가격

        while (menu != 0) {//메뉴 0번 입력시 다음
            System.out.println("주문하실 메뉴를 골라주세요 . \n 1.빅맥 : 참깨빵위에 ...\n 2.더블불고기 : 불고기 패티가 두장!\n 3.1955 : 매콤한 소스~\n 4.선택안함 ");
            menu = Integer.parseInt(sc.nextLine());
            System.out.println("메뉴의 개수를 골라주세요.");
            menuNum01 = Integer.parseInt(sc.nextLine());

            if (menu == 1) {
                a = 4300;
            } else if (menu == 2) {
                a = 4500;
            } else if (menu == 3) {
                a = 5500;
            } else if (menu == 4) {
                a = 0;
            }

            System.out.println("주문하실 메뉴를 골라주세요. \n 1.감자튀김 \n 2.치즈스틱 \n 3.콘샐러드 \n 4.선택안함");
            menu = Integer.parseInt(sc.nextLine());
            System.out.println("메뉴의 개수를 골라주세요.");
            menuNum02 = Integer.parseInt(sc.nextLine());

            if (menu == 1) {
                b = 1700;
            } else if (menu == 2) {
                b = 1500;
            } else if (menu == 3) {
                b = 2000;
            } else if (menu == 4) {
                b = 0;
            }

            System.out.println("주문하실 메뉴를 골라주세요. \n 1.콜라 \n 2.사이다 \n 3.환타 \n 4.선택안함 ");
            menu = Integer.parseInt(sc.nextLine());
            System.out.println("메뉴의 개수를 골라주세요.");
            menuNum03 = Integer.parseInt(sc.nextLine());


            if (menu == 1) {
                c = 1300;
            } else if (menu == 2) {
                c = 1300;
            } else if (menu == 3) {
                c = 1300;
            } else if (menu == 4) {
                c = 0;
            }

            price += (a * menuNum01) + (b * menuNum02) + (c * menuNum03); //왜 ==은 안되지?
            System.out.print("종료하시겠습니까? 0.종료  5.계속\n");
            menu = Integer.parseInt(sc.nextLine());
        }
        System.out.println("총 금액은" + price + "원 입니다.");
    }
}

//main은 하나만
//static -> 하나만 존재하는 영역 여러 쓰레드의 상위개념
//