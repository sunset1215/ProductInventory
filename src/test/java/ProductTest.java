import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    
    @Test
    public void testShouldStoreId() {
        Product p = new Product(10);
        Assert.assertEquals(10, p.getId());
    }
    
    
}
