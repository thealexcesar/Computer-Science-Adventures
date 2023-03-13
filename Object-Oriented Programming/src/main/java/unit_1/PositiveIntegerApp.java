package unit_1;

public class PositiveIntegerApp {
    public static void main(String[] args) {
        PositiveInteger pos = new PositiveInteger();
        pos.setValue(10);

        String text = "---------------------------------------";
        text += "\nValor de x: " + pos.getValue();
        text += "\nX multiplicado por 3: " + pos.multiply(3);
        text += "\nFatorial: " + pos.factorial();
        text += "\nNumeros divisores: ";
        for (int div : pos.getDivisors()) {
            text += div == pos.getValue() ? (div + ".") : (div + ", ");
        }
        text += "\nQuantidade de divisores: " + pos.getNumDivisors();
        text += "\nSequência de Fibonacci: ";
        for (int fib : pos.fibonacciSequence()) {
            text += (fib + ", ");
        }
                text += "\nFórmula H: " + pos.getH();
        text += "\nFórmula I: " + pos.getI();
        text += "\nFórmula S: " + pos.getS();
        text += "\n---------------------------------------";

        System.out.println(text);
    }
}
