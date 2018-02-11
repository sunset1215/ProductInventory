import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    
    @Test
    public void testShouldStoreId() {
        Product p = new Product(10);
        Assert.assertEquals(10, p.getId());
    }
    
    @Test
    public void testAutoIncrementId() {
        Product p1 = new Product();
        Product p2 = new Product();
        Assert.assertEquals(p1.getId() + 1, p2.getId());
    }
    
    
}
