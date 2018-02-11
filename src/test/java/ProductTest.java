import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductTest {
    
    private static final Logger logger = LoggerFactory.getLogger(ProductTest.class);
    
    @Test
    public void testShouldStoreId() {
        Product p = new Product();
        logger.debug("id={}", p.getId());
        assertTrue(p.getId() > 0);
    }
    
    @Test
    public void testAutoIncrementId() {
        Product p1 = new Product();
        Product p2 = new Product();
        logger.debug("p1.id={}, p2.id={}", p1.getId(), p2.getId());
        assertEquals(p1.getId() + 1, p2.getId());
    }
    
    @Test
    public void testShouldStoreName() {
        Product p = new Product("Lays");
        assertEquals("Lays", p.getName());
    }
    
    
}
