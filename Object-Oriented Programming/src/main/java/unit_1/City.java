package unit_1;

public class City {
    private String name, uf;
    private int femalePopulation, malePopulation;
    private boolean calculatded;

    public City(String name, String uf, int femalePopulation, int malePopulation, boolean calculatded) {
        this.setName(name);
        this.setUf(uf);
        this.setFemalePopulation(femalePopulation);
        this.setMalePopulation(malePopulation);
        this.setCalculatded(calculatded);
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public int getFemalePopulation() {
        return femalePopulation;
    }

    public int getMalePopulation() {
        return malePopulation;
    }

    public boolean isCalculatded() {
        return calculatded;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setFemalePopulation(int femalePopulation) {
        this.femalePopulation = femalePopulation;
    }

    public void setMalePopulation(int malePopulation) {
        this.malePopulation = malePopulation;
    }

    public void setCalculatded(boolean calculatded) {
        this.calculatded = calculatded;
    }

    @Override
    public String toString() {
        return "Cidades:" +
                "\n---------------------------------------" +
                "\nNome: " + name + "\nUF: " + uf +
                "\nPopulação Feminina: " + femalePopulation +
                "\nPopulação Masculina: " + malePopulation +
                "\nCalculado:" + calculatded +
                "\n---------------------------------------";
    }
}
