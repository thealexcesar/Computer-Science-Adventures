package unit_1;

import java.util.Scanner;

public class Calculator {
    private float firstN, secondN;

    public Calculator(float firstN, float secondN) {
        this.setFirstN(firstN);
        this.setSecondN(secondN);
    }

    public float getFirstN() {
        return firstN;
    }

    public void setFirstN(float firstN) {
        this.firstN = firstN;
    }

    public float getSecondN() {
        return secondN;
    }

    public void setSecondN(float secondN) {
        this.secondN = secondN;
    }

    public float sum() {
        return firstN + secondN;
    }

    public float divide() {
        return firstN / secondN;
    }

    public float mult() {
        return firstN * secondN;
    }

    public float sub() {
        return firstN - secondN;
    }
}
