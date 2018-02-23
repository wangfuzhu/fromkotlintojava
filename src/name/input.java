package name;
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
}





