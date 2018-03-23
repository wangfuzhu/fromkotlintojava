import java.util.ArrayList;
import java.text.DecimalFormat;

public class Shop{
    public ArrayList<Product> products = new ArrayList<Product>();
    public void add(int id, String name, int quantity, double price){
        products.add(new Product(id,name,quantity,price));
    }
    public void change(int id,String name, int quantity, double price){
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
    public String getName(int id){
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
    public String getPrice(int id, int num){
        //get price from id
        for (int i=0;
                i < products.size();
                i++){
            if (products.get(i).getId() == id){
                double sum = products.get(i).getPrice() * num;
                double small = sum*100;
                int moneySmall = (int)small - (int)sum *100;
                DecimalFormat tow  = new DecimalFormat("######0");
                return tow.format(sum)+"рублей"+moneySmall+"копеек";
            }
        }
        return "0 рублевый 0 копеек";
    }
    public int getQuantity(int id){
        //get quantity from id
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getId() == id){
                return products.get(i).getQuantity();
            }
        }
        return 0;
    }
}
