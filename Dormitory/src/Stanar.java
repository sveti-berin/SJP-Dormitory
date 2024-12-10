public class Stanar {

    private String ime;
    private String prezime;
    private String brojSobe;
    private double mjesecnaCijena;

    public Stanar(String ime, String prezime, String brojSobe, double mjesecnaCijena) {

        if (mjesecnaCijena < 0) {return;}

        this.ime = ime;
        this.prezime = prezime;
        this.brojSobe = brojSobe;
        this.mjesecnaCijena = mjesecnaCijena;

    }

    public void ispisInformacija(){
        System.out.println("Ime: " + ime + "| Prezime: " + prezime + "| Broj sobe: " + brojSobe  + "| Mjesecčna cijena: " + mjesecnaCijena);
    }

    @Override

    public String toString() {
        return ime + " " + prezime + " " + brojSobe  + " " + mjesecnaCijena;
    }

    public double getMjesecnaCijena() {
        return mjesecnaCijena;
    }


}
