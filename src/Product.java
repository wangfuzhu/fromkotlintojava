public class Product {
    private String price;
    private int id;
    private String name;
    private int quantity;

    public Product(int id,String name,int quantity, String price){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){ return name; }
    public void setName(String name){
        this.name = name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
