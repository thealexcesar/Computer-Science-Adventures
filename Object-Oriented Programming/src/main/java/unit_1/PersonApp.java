package unit_1;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alex");
        person.setGenre('M');
        person.setDateOfBirth("2023/03/06");
        person.getMaritalStatus();
        System.out.println(person.toString());
    }
}
