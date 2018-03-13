import org.junit.Test;
import static org.junit.Assert.*;
public class test {
    @Test
    public void test(){
        Shop shop = new Shop();
        shop.add(1,"Кока-кола",100,"50рублей24копеек");
        shop.add(2,"Пепси",200,"20рублей00копеек");
        shop.add(3,"Сок",300,"620рублей12копеек");
        shop.add(4,"Оранжевый",400,"56рублей75копеек");
        assertEquals(shop.getNameFI(2),"Пепси");
        assertEquals(shop.getPriceFI(1),"50рублей24копеек");
        assertEquals(shop.getQuantityFI(3),300);

        shop.change(1,"cola",23,"50рублей24копеек");
        assertEquals(shop.getNameFI(1),"cola");
        assertEquals(shop.getPriceFI(1),"50рублей24копеек");
        assertEquals(shop.getQuantityFI(1),23);
    }
}
