import org.junit.Test;
import static org.junit.Assert.*;
public class test {
    @Test
    public void test(){
        Shop shop = new Shop();
        shop.add(1,"Кока-кола",100,50.24);
        shop.add(2,"Пепси",200,20.00);
        shop.add(3,"Сок",300,620.12);
        shop.add(4,"Оранжевый",400,56.75);
        assertEquals(shop.getName(2),"Пепси");
        assertEquals(shop.getPrice(1,1),"50рублей24копеек");
        assertEquals(shop.getPrice(2,3),"60рублей0копеек");
        assertEquals(shop.getQuantity(3),300);

        shop.change(1,"cola",23,50.24);
        assertEquals(shop.getName(1),"cola");
        assertEquals(shop.getPrice(1,1),"50рублей24копеек");
        assertEquals(shop.getQuantity(1),23);
    }
}
