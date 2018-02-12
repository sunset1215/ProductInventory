import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnumTest {
    
    private enum Fruit {
        APPLE("Apple");
        
        private final String text;
        
        Fruit(String text) {
            this.text = text;
        }
        
        public String text() {
            return text;
        }
    }
    
    @Test
    public void testGetEnumName() {
        assertEquals("APPLE", Fruit.APPLE.name());
    }
    
    @Test
    public void testGetEnumToString() {
        assertEquals("APPLE", Fruit.APPLE.toString());
    }
    
    @Test
    public void testGetEnumText() {
        assertEquals("Apple", Fruit.APPLE.text());
    }

}
