package Kiosk03;

import java.util.ArrayList;
import java.util.List;

public class ArrayMenu {
    private String name;
    private int price;

    public ArrayMenu(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

        public static void main(String[] args) {
            ArrayMenu m1 = new ArrayMenu("빅맥 : 참깨빵 위에...", 4800);
            ArrayMenu m2 = new ArrayMenu("더블불고기 : 패티가 두장!", 5000);
            ArrayMenu m3 = new ArrayMenu("1955 : 패콤한 소스~", 5500);

            List<ArrayMenu> arr = new ArrayList<ArrayMenu>();
            arr.add(m1);
            arr.add(m2);
            arr.add(m3);

            for(int i = 0; i< arr.size(); i++){
                System.out.println(i+1 + ". " +arr.get(i).getName());
                System.out.println("가격:"+arr.get(i).getPrice());
            }

        }
    }

