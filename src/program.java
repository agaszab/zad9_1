import java.util.Scanner;

public class program {


    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        String imie;
        String nazwisko;
        int wiek;


        try {

            System.out.println("Podaj imię:");
            imie = scan.nextLine();
            System.out.println("Podaj nazwisko:");
            nazwisko = scan.nextLine();
            System.out.println("Podaj wiek:");
            wiek = scan.nextInt();
            System.out.println("Podaj PESEL:");
            Long pesel=scan.nextLong();
            scan.nextLine();
            Person person = new Person(imie,nazwisko, wiek, pesel );
            person.show();
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        } catch (IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }


    }
}
