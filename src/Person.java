public class Person {

    String firstName;
    String lastName;
    int age;
    long pesel;

    public Person(String firstName, String lastName, int age, long pesel)  throws IncorrectAgeException, NameUndefinedException {

        if (lastName == null || lastName.length() < 2)
            throw new NameUndefinedException("Nie podałeś nazwiska lub jest ono za krótkie");

        if (firstName == null || firstName.length() < 2)
            throw new NameUndefinedException("Nie podałeś imienia lub jest ono za krótkie");

        if (age < 1)
            throw new IncorrectAgeException("Nieprawidłowy wiek - podaj liczbę większą od 0");

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
