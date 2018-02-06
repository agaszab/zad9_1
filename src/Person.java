public class Person {

    String firstName;
    String lastName;
    int age;
    long pesel;

    public Person(String firstName, String lastName, int age, long pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    void show() {
        System.out.println("Imię: " + getFirstName());
        System.out.println("Nazwisko: " + getLastName());
        System.out.println("Wiek: " + getAge());
        System.out.println("PESEL: " + getPesel());
    }
}
