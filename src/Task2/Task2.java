package Task2;

import java.util.ArrayList;
import java.util.List;

class Valuta {
    private String valuta;
    private double kurs;

    public Valuta(String valuta, double kurs) {
        this.valuta = valuta;
        this.kurs = kurs;
    }

    public String getValuta() {
        return valuta;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public double getKurs() {
        return kurs;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }
}
    class ValutaKalkulator {
        private ArrayList<Valuta> valutakurser = new ArrayList<>();
        public ValutaKalkulator(ArrayList<Valuta> valutakurser){
            this.valutakurser = valutakurser;
        }
        public double beregnKurs(String valuta) {
            double sum = 0.00; // instance
            // kode her
            for (Valuta curr : valutakurser){
                if (valuta.equals(curr.getValuta())){
                    sum = curr.getKurs();
                }
            }
            return sum;
        }
    }
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Valuta> val = new ArrayList<>();
        Valuta usd = new Valuta("usd", 11);
        Valuta ddk = new Valuta("Danske kroner", 7.5);
        // kode her
        val.add(usd);
        val.add(ddk);

        ValutaKalkulator valcalc = new ValutaKalkulator(val);
        valcalc.beregnKurs("usd");

    }
}
