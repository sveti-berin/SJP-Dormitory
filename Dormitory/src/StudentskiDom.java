import java.util.ArrayList;

public class StudentskiDom {

    private String nazivDoma;
    private int kapacitet;
    private ArrayList<Stanar> stanari;

    public StudentskiDom(String nazivDoma, int kapacitet) {
        this.nazivDoma = nazivDoma;
        this.kapacitet = kapacitet;
        stanari = new ArrayList<>();
    }

    public void dodajStanar(Stanar stanko){
        stanari.add(stanko);
        System.out.println("Stanar " + stanko.toString() +" dodan u studentski dom " + nazivDoma);
    }

    public void ukloniStanara(Stanar stanko){
        stanari.remove(stanko);
        System.out.println("Stanar " + stanko.toString() +" uklonjen iz " + nazivDoma);
    }

    public double izracunajPrihod(){
        double prihod = 0.0;

        for (Stanar stankec: stanari){
            prihod += stankec.getMjesecnaCijena();

        }
        return prihod;
    }

    public void prikaziStanare(){
        for (Stanar stankec: stanari){
            System.out.println(stankec.toString());
        }
    }


}
