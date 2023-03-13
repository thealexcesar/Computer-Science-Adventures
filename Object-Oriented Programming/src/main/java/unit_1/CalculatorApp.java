package unit_1;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        float n1 = input.nextFloat();
        System.out.println("\nDigite o símbulo correto para calcular:"+"\n-----------------------------------------"+
                "\nsomar: +\nSubtrair: -\nMultiplicar: *\nDividir: /"+"\n-----------------------------------------"
        );
        float n2 = input.nextFloat();
        System.out.print("Digite o segundo número: ");
        char calc = input.next().charAt(0);

        float total = 0.0F;
        Calculator sum = new Calculator(n1, n2);
        Calculator sub = new Calculator(n1, n2);
        Calculator mult = new Calculator(n1, n2);
        Calculator divide = new Calculator(n1, n2);

        switch (calc) {
            case '+' : total = sum.sum(); break;
            case '-' : total = sub.sub(); break;
            case '*' : total = mult.mult(); break;
            case '/' : total = divide.divide(); break;
        }
        System.out.println(total);
    }
}
