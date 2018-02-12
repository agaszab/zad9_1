import java.util.Scanner;

public class program {


    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        String imie;
        String nazwisko;
        int wiek;


        try {
            Person person = new Person();
            System.out.println("Podaj imię:");
            imie = scan.nextLine();
            person.setFirstName(imie);
            System.out.println("Podaj nazwisko:");
            nazwisko = scan.nextLine();
            person.setLastName(nazwisko);
            System.out.println("Podaj wiek:");
            wiek = scan.nextInt();
            person.setAge(wiek);
            System.out.println("Podaj PESEL:");
            person.setPesel(scan.nextLong());
            scan.nextLine();
            person.show();
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        } catch (IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }


    }
}
