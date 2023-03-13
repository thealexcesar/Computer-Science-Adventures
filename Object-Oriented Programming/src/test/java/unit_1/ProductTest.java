package unit_1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {
    @Test
    public void testProductCreation() {
        // create a new product
        Product product = new Product("Caderno", "Caderno em espiral tamanho médio", 4.50, 15);

        // check if the product was created correctly
        assertEquals("Caderno", product.getName());
        assertEquals("Caderno em espiral tamanho médio", product.getDescription());
        assertEquals(4.50, product.getPrice());
        assertEquals(15, product.getDiscount());
    }

    @Test
    public void testProductDiscount() {
        // create a new product
        Product product = new Product("Caneta ESF", "Caneta esferográfica 5mm", 1.20, 2);

        // check if the discount is applied correctly
        assertEquals(1.176, product.getPriceWithDiscount(), 0.001);
    }

}