package unit_1;

public class PositiveInteger {
    private int x;

    public void setValue(int value) {
        if (value > 0) {
            x = value;
        }
    }

    public int getValue() {
        return x;
    }

    public int multiply(int other) {
        return x * other;
    }

    public int factorial() {
        int result = 1;
        for (int i = x; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public int[] getDivisors() {
        int[] divisors = new int[x];
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                divisors[count] = i;
                count++;
            }
        }
        int[] result = new int[count];
        System.arraycopy(divisors, 0, result, 0, count);
        return result;
    }

    public int getNumDivisors() {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        return count;
    }

    public int[] fibonacciSequence() {
        int[] result = new int[x];
        int prev = 1;
        int current = 1;
        for (int i = 0; i < x; i++) {
            if (i == 0 || i == 1) {
                result[i] = 1;
            } else {
                int sum = prev + current;
                result[i] = sum;
                prev = current;
                current = sum;
            }
        }
        return result;
    }

    public double getH() {
        double result = 0.0;
        for (int i = 1; i <= x; i++) {
            result += 1.0 / i;
        }
        return result;
    }

    public double getI() {
        double result = 0.0;
        for (int i = 0; i < x; i++) {
            result += (i + 1.0) / (x - i);
        }
        return result;
    }

    public double getS() {
        double result = 0.0;
        for (int i = 20; i >= 2; i--) {
            double term = Math.pow(x, i) / factorial(i);
            result += term;
        }
        return result;
    }

    private int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }
}
