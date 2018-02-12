import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductTest {
    
    private static final Logger logger = LoggerFactory.getLogger(ProductTest.class);
    private static final double DEFAULT_PRICE = 12.12;
    private static final int DEFAULT_QUANTITY = 10;
    private static final Category DEFAULT_CATEGORY = Product.Category.UNSELECTED;
    
    private Product p1;
    private Product p2;
    
    @Before
    public void setUp() {
        p1 = new Product("p1");
        p1.setPrice(new BigDecimal(DEFAULT_PRICE));
        p1.setQuantity(DEFAULT_QUANTITY);
    }
    
    private void setUpSecondProduct() {
        p2 = new Product("p2");
        p2.setPrice(new BigDecimal(DEFAULT_PRICE));
        p2.setQuantity(DEFAULT_QUANTITY);
    }
    
    @Test
    public void testShouldStoreId() {
        logger.debug("id={}", p1.getId());
        assertTrue(p1.getId() > 0);
    }
    
    @Test
    public void testAutoIncrementId() {
        setUpSecondProduct();
        logger.debug("p1.id={}, p2.id={}", p1.getId(), p2.getId());
        assertEquals(p1.getId() + 1, p2.getId());
    }
    
    @Test
    public void testShouldStoreName() {
        logger.debug("name={}", p1.getName());
        assertEquals("p1", p1.getName());
    }
    
    @Test
    public void testShouldStorePrice() {
        assertEquals(new BigDecimal(DEFAULT_PRICE), p1.getPrice());
    }
    
    @Test
    public void testSamePriceOnDifferentProductShouldBeEqual() {
        setUpSecondProduct();
        assertEquals(p1.getPrice(), p2.getPrice());
    }
    
    @Test
    public void testShouldStoreQuantity() {
        assertEquals(DEFAULT_QUANTITY, p1.getQuantity());
    }
    
    @Test
    public void testShouldStoreCategory() {
        assertEquals(DEFAULT_CATEGORY, p1.getCategory());
    }
    
    
}
