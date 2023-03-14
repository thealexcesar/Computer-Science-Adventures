package unit_2;

import java.text.DecimalFormat;

public class IncomeTax {
    private String name, cpf, uf;
    private double salary;

    public IncomeTax(String name, String cpf, String uf, double salary) {
        this.setName(name);
        this.setCpf(cpf);
        this.setUf(uf);
        this.setSalary(salary);
    }

    public IncomeTax() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double aliquot() {
        double total = 0.0F;
        if (getSalary() > 4000 && getSalary() <=  9000) {
            total = 5.9F;
        } else if (getSalary() > 9000 && getSalary() <= 25000) {
            total = 15.1F;
        } else if (getSalary() > 25000 && getSalary() <= 35000) {
            total = 27.2F;
        } else if (getSalary() > 35000) {
            total = 31.0F;
        }
        return total;
    }

    public double toPay() {
        return this.salary * aliquot();
    }

    @Override
    public String toString() {
        return "\nNome: " + name + "\nCPF: " + cpf +
                "\nUF: " + uf + "\nSalário Anual: " + String.format("%.2f", salary) +
                "\nAliquota: " + String.format("%.2f", aliquot()) +
                "\nTotal a pagar: " + String.format("%.2f", toPay());
    }
}
