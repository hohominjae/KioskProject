package Kiosk03;

import java.util.ArrayList;

public class ArrayOrder {
    private int menuNum;
    private String menuName;
    private int menuNum01;
    public ArrayOrder(int menuNum, String menuName, int menuNum01){
        this.menuName = menuName;
        this.menuNum = menuNum;
        this.menuNum01 = menuNum01;
    }
    public void setmenuNum(int menuNum){
        this.menuNum=menuNum;
    }
    public void setmenuNum01(int menuNum01){
        this.menuNum01=menuNum01;
    }
    public void setmenuName(String menuName){
        this.menuName=menuName;
    }
    public int getmenuNum(){
        return menuNum;}
    public int getMenuNum01(){return menuNum01;}
    public String getMenuName(int menu){return menuName;}
    public void arrayOrder(){
        ArrayOrder m1 = new ArrayOrder(1, "빅맥", 4300);
        ArrayOrder m2 = new ArrayOrder(2, "더블불고기", 4500);
        ArrayOrder m3 = new ArrayOrder(3, "1955", 5500);

        ArrayList<ArrayOrder> arr = new ArrayList<>();
        arr.add(m1);
        arr.add(m2);
        arr.add(m3);
        }

    }
//생성자와 메서드는 다르다  생성자는 함수x 리턴값 필요없다.
//생성자는 조건을 만들어주는역할
//메서드 행위를 하는 친구
//인풋(사용자가입력) || 아규먼트/파라미터? -> 메서드의 전달해주는 값