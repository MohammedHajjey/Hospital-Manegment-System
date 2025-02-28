
public class Pharmcy {
    private int buyingPrice,sellingPrice,quantity,id;
    private String name,description;

    public Pharmcy(int buyingPrice, int sellingPrice, int quantity, int id, String name, String description) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.id = id;
        this.name = name;
        this.description = description;
    }

    
    
    public Pharmcy() {
        this.id = 0;
        this.buyingPrice = 0;
        this.sellingPrice = 0;
        this.quantity = 0;
        this.name = "";
        this.description = ""; 
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Pharmcy{" + "buyingPrice=" + buyingPrice + ", sellingPrice=" + sellingPrice + ", quantity=" + quantity + ", id=" + id + ", name=" + name + ", description=" + description + '}';
    }

    
     
    
    
}
