package name;

import java.text.DecimalFormat;

public class input {
    // information
    private int id;// id
    private String name;//russian name
    private int number;//quantity
    private int bigPrice;//ruble
    private int smallPrice;//goebbie
    public input(int id,String name, int number, int bigPrice, int smallPrice){
        super();
        this.id = id;
        this.number = number;
        this.name = name;
        this.bigPrice = bigPrice;
        this.smallPrice = smallPrice;
    }
    public void printName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void printiNu(int number){
        this.number = number;
    }
    public int geyNu(){
        return number;
    }
    public void printBig(int bigPrice){
        this.bigPrice = bigPrice;
    }
    public int getBig() {
        return bigPrice;
    }
    public void printSma(int smallPrice){
        this.bigPrice = bigPrice;
    }
    public int getSma() {
        return smallPrice;
    }
    public String nameOld(){
        String nam = name;
        System.out.println("имя:"+ nam);
        return name;
    }
    public String nameN(String nameNew){
        String namN = "";
        if (nameNew == "не изменение"){
            System.out.println("новый имя:"+ name);
            return namN;
        }else {
            System.out.println("новый имя:"+ nameNew);
            return namN;
        }
    }
    public int nNumber(){
        int nNum = number;
        System.out.println("количество:"+ nNum);
        return number;
    }
    public int numberCha(int nu){
        int sum = number + nu;
        if (sum >= 0){
            System.out.println("сейчас количество:"+sum);
            return sum;
        }else{
            System.out.println("нету");
            return sum;
        }
    }
    public String moneySum(){
        System.out.println(bigPrice+"рублей"+smallPrice+"копеек");
        return "";
    }
    public String money(double moneyCh){
        double big = bigPrice;
        double small = smallPrice;
        double moneyN = big + small / 100;
        double moneyAll = moneyN + moneyCh;
        double sma = moneyAll*100;
        int moneyS = (int)sma - (int) moneyAll *100;
        DecimalFormat tow  = new DecimalFormat("######0");
        System.out.println("новая цена:"+tow.format(moneyAll)+"рублей"+moneyS+"копеек");
        return "";
    }
}





