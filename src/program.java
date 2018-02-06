import java.util.Scanner;

public class program {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person();

        String imie;
        String nazwisko;
        int wiek;


        System.out.println("Podaj imię:");
        imie = scan.nextLine();

        if (imie == null || imie.length() < 2)
            throw new NameUndefinedException();

        else {
            person.setFirstName(imie);
            System.out.println("Podaj nazwisko:");
            nazwisko = scan.nextLine();

            if (nazwisko == null || nazwisko.length() < 2)
                throw new NameUndefinedException();
            else {

                person.setLastName(nazwisko);

            }
        }

        System.out.println("Podaj wiek:");
        wiek = scan.nextInt();

        if (wiek < 1)
            throw new IncorrectAgeException();
        else
            person.setAge(wiek);

        System.out.println("Podaj PESEL:");
        person.setPesel(scan.nextLong());

        scan.nextLine();

        person.show();

    }
}
