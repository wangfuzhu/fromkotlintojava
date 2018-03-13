import java.util.ArrayList;

public class Shop{
    ArrayList<Product> products = new ArrayList<Product>();
    public void add(int id, String name, int quantity, String price){
        products.add(new Product(id,name,quantity,price));
    }
    public void change(int id,String name, int quantity, String price){
        for (int i = 0;
             i < products.size();
             i++){
            if (products.get(i).getId() == id){
                products.get(i).setName(name);
                products.get(i).setPrice(price);
                products.get(i).setQuantity(quantity);
            }
        }
    }
    public String getNameFI(int id){
        // get name from id
        for (int i =0;
             i < products.size();
             i++){
            if (products.get(i).getId() == id){
                return products.get(i).getName();
            }
        }
        return "";
    }
    public String getPriceFI(int id){
        //get price from id
        for (int i=0;
                i < products.size();
                i++){
            if (products.get(i).getId() == id){
                return products.get(i).getPrice();
            }
        }
        return "0 рублевый 0 копеек";
    }
    public int getQuantityFI(int id){
        //get quantity from id
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getId() == id){
                return products.get(i).getQuantity();
            }
        }
        return 0;
    }
}
