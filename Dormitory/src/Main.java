import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = String.valueOf(sc.nextLine());

    StudentskiDom nedzarici = new StudentskiDom("Nedzarići", 200);

    Stanar s1 = new Stanar("Berin", "Mujkić", "25A", 200);
    Stanar s2 = new Stanar("Belmin", "Mujkićovski", "12B", 230);
    Stanar s3 = new Stanar("Borko", "Frulić", "122C", 400);


    nedzarici.dodajStanar(s1);
    nedzarici.dodajStanar(s3);
    nedzarici.dodajStanar(s2);

    nedzarici.prikaziStanare();

    nedzarici.ukloniStanara(s2);

    System.out.println(nedzarici.izracunajPrihod());


















    }
}