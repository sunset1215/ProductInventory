import java.math.BigDecimal;

public class Product {
    
    public enum Category {
        UNSELECTED
    }
    
    private static int lastGeneratedId = 0;
    
    private int id;
    private String name;
    private BigDecimal price;
    private int quantity;
    private Category category;
    
    public Product(String name) {
        setId(++lastGeneratedId);
        setName(name);
        setPrice(new BigDecimal(0.00));
        setQuantity(0);
        setCategory(Category.UNSELECTED);
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
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Category getCategory() {
        return category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
}
