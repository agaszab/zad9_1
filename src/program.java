import java.util.Scanner;

public class program  {


    public static void main(String[] args) throws IncorrectAgeException, NameUndefinedException {
        Scanner scan = new Scanner(System.in);
        Person person = new Person();

        String imie;
        String nazwisko;
        int wiek;


        System.out.println("Podaj imię:");
        imie = scan.nextLine();

        if (imie == null || imie.length() < 2)
            throw new NameUndefinedException("Nie podałeś imienia lub jest ono za krótkie");

        else {
            person.setFirstName(imie);
            System.out.println("Podaj nazwisko:");
            nazwisko = scan.nextLine();

            if (nazwisko == null || nazwisko.length() < 2)
                throw new NameUndefinedException("Nie podałeś nazwiska lub jest ono za krótkie");
            else {

                person.setLastName(nazwisko);

            }
        }

        System.out.println("Podaj wiek:");
        wiek = scan.nextInt();

        if (wiek < 1)
            throw new IncorrectAgeException("Nieprawidłowy wiek - podaj liczbę większą od 0");

        else
            person.setAge(wiek);

        System.out.println("Podaj PESEL:");
        person.setPesel(scan.nextLong());

        scan.nextLine();

        person.show();

    }
}
