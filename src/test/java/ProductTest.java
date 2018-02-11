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
        Assert.assertEquals(1, p1.getId());
        Product p2 = new Product();
        Assert.assertEquals(2, p2.getId());
    }
    
    
}
