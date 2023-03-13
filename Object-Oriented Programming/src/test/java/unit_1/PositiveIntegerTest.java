package unit_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveIntegerTest {

    @Test
    void setValue() {
    }

    @Test
    void getValue() {
    }

    @Test
    void multiply() {
    }

    @Test
    void factorial() {
    }

    @Test
    void getDivisors() {
    }

    @Test
    void getNumDivisors() {
    }

    @Test
    void fibonacciSequence() {
    }

    @Test
    void getH() {
    }

    @Test
    void getI() {
    }

    @Test
    void getS() {
    }
}

/*
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerPositiveTest {

    @Test
    public void testSetValor() {
        IntegerPositive i = new IntegerPositive();
        i.setValor(5);
        assertEquals(5, i.getValor());
        assertThrows(IllegalArgumentException.class, () -> {
            i.setValor(-1);
        });
    }

    @Test
    public void testMultiplicar() {
        IntegerPositive i1 = new IntegerPositive(5);
        IntegerPositive i2 = new IntegerPositive(3);
        IntegerPositive i3 = i1.multiplicar(i2);
        assertEquals(15, i3.getValor());
    }

    @Test
    public void testFatorial() {
        IntegerPositive i = new IntegerPositive(5);
        assertEquals(120, i.fatorial());
    }

    @Test
    public void testDivisores() {
        IntegerPositive i = new IntegerPositive(12);
        int[] expected = {1, 2, 3, 4, 6, 12};
        assertArrayEquals(expected, i.divisores());
        assertEquals(6, i.qtdDivisores());
    }

    @Test
    public void testFibonacci() {
        IntegerPositive i = new IntegerPositive(8);
        int[] expected = {1, 1, 2, 3, 5, 8, 13, 21};
        assertArrayEquals(expected, i.fibonacci());
    }

    @Test
    public void testH() {
        IntegerPositive i = new IntegerPositive(5);
        double expected = 1.5333333333333334;
        assertEquals(expected, i.h(), 0.0001);
    }

    @Test
    public void testI() {
        IntegerPositive i = new IntegerPositive(5);
        double expected = 1.4636111111111112;
        assertEquals(expected, i.i(), 0.0001);
    }

    @Test
    public void testS() {
        IntegerPositive i = new IntegerPositive(5);
        double expected = 1430.7666666666664;
        assertEquals(expected, i.s(), 0.0001);
    }

    @Test
    public void testP() {
        IntegerPositive i = new IntegerPositive(4);
        double expected = 1.8333333333333333;
        assertEquals(expected, i.p(2), 0.0001);
    }
}

*/