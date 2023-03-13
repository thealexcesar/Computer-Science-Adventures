package unit_1;

/**
 * @author alexcesar
 * Based on the object representations above for a Product class, write the necessary Java code to support such objects,
 * i.e., the code needed to create the class and instantiate the objects so that they are in the presented state.
 **/
public class Product {
    /**
     * Program get Products and returns price with discounts.
     **/
    private String name, description;
    private double price, discount;

    public Product(String name, String description, double price, double discount) {
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setDiscount(discount);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPriceWithDiscount() {
        return price - (price * (discount / 100));
    }

    @Override
    public String toString() {
        return  "produto \n-----------------------------------" +
                "\nNome: " + name + "\nDescrição: " + description +
                "\nPreço do produto: " + price + "\nDesconto: " + discount +
                "\nPreço com desconto: " + getPriceWithDiscount() +
                "\n-----------------------------------";
    }

}
