package unit_1;

public class ProductApp {
    public static void main(String[] args) {
        String[] names = { "Caderno em espiral", "Caneta ESF", "Esquadro" };
        String[] descriptions = {
                "Caderno em espiral tamanho médio",
                "Caneta esferográfica 5mm",
                "Esquadro de acrílico 20 cm"
        };

        Product produto1 = new Product(names[0], descriptions[0], 29.00, 10);
        Product produto2 = new Product(names[1], descriptions[1], 10.00, 5);
        Product produto3 = new Product(names[2], descriptions[2], 45.50, 25);
        System.out.println("\n1º " + produto1);
        System.out.println("\n2º " + produto2);
        System.out.println("\n3º " + produto3);
    }
}
