package test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import name.input;
import java.lang.String;

public class Test {
    private static Map<Integer,input> goods = new HashMap<Integer,input>();
    public static void main(String[] args) {
        System.out.println("Система супермаркетов");
        String name1 = "Кока-кола";
        String name2 = "Пепси";
        String name3 = "Сок яблочный";
        String name4 = "Оранжевый";
        printTable("id","name","ruble","goebbie","quantity");
        printTable("1",name1,"55","49","8");
        printTable("2",name2,"50","11","12");
        printTable("3",name3,"128","60","34");
        printTable("4",name4,"170","22","25");
        goods.put(1,new input(1,name1,8,55,49));
        goods.put(2,new input(2,name2,12,50,11));
        goods.put(3,new input(3,name3,34,128,60));
        goods.put(4,new input(4,name4,25,170,22));
        Scanner inside = new Scanner(System.in);
        System.out.println("номер:");
        int unmber = inside.nextInt();
        input market = goods.get(unmber);
        market.nameOld();
        System.out.println("изменение имя:(если не измемение .написайте не измемение!)");
        String nameNew = inside.next();
        market.nameN(nameNew);
        market.nNumber();
        int nu = inside.nextInt();
        market.numberCha(nu);
        market.moneySum();
        double moneyCh = inside.nextDouble();
        market.money(moneyCh);
        System.out.println("Последняя версия");
        market.nameN(nameNew);
        market.numberCha(nu);
        market.money(moneyCh);
    }
    private static void printTable(String row1,String row2,String row3,String row4,String row5) {
        System.out.print(row1);
        for (int i = 0; i < 15 - row2.length();i++) {
            System.out.print(" ");
        }
        System.out.print(row2);
        for (int i = 0; i < 10 - row3.length();i++) {
            System.out.print(" ");
        }
        System.out.print(row3);
        for (int i = 0; i < 10 - row4.length();i++) {
            System.out.print(" ");
        }
        System.out.print(row4);
        for (int i = 0; i < 10 - row5.length();i++) {
            System.out.print(" ");
        }
        System.out.print(row5);
        System.out.println("\n");

    }
}
