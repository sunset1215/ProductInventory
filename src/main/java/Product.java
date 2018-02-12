import java.math.BigDecimal;

public class Product {
    
    private static int lastGeneratedId = 0;
    
    private int id;
    private String name;
    private BigDecimal price;
    
    public Product(String name) {
        setId(++lastGeneratedId);
        setName(name);
    }
    
    public int getId() {
        return id;
    }
    
    private void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    private void setName(String name) {
        this.name = name;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
