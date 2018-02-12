import org.junit.Test;

public class InventoryTest {
    
    @Test
    public void testShouldStoreListOfProducts() {
        Inventory inventory = new Inventory();
        Product p1 = new Product("p1");
        Product p2 = new Product("p2");
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        assertEquals(2, inventory.getNumberOfProducts());
    }
    
}
