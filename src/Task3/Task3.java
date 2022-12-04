package Task3;

import java.util.ArrayList;

class personalia{
    String navn;
    String adresse;
    String telefonnr;

    public personalia(String navn, String adresse, String telefonnr) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    @Override
    public String toString() {
        return
                "navnet er" + navn + "\n" +
                ", adressen er: " + adresse + "\n" +
                ", telefonnummetet er: " + telefonnr + '\'' +
                '}';
    }
}

class student{
    personalia personalia;
    String studentnr;

    public student(personalia personalia, String studentnr) {
        this.personalia = personalia;
        this.studentnr = studentnr;
    }

    public personalia getPersonalia() {
        return personalia;
    }

    public void setPersonalia(personalia personalia) {
        this.personalia = personalia;
    }

    public String getStudentnr() {
        return studentnr;
    }

    public void setStudentnr(String studentnr) {
        this.studentnr = studentnr;
    }

    @Override
    public String toString() {
        return "Studenten er: " +
                  personalia.toString() +
                " studentnummeret er " + studentnr + "\n";
    }
}

class ansatt{
    personalia personalia;
    String tittel;

    public ansatt(personalia personalia, String tittel) {
        this.personalia = personalia;
        this.tittel = tittel;
    }

    public personalia getPersonalia() {
        return personalia;
    }

    public void setPersonalia(personalia personalia) {
        this.personalia = personalia;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    @Override
    public String toString() {
        return "Ansatten er: " +
                personalia.toString() +
                "Stillingstittelen er: " + tittel + "\n";
    }
}

public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) {
        personalia ansatt = new personalia("Per", "Haslveien 0", "9187263577");
        personalia student = new personalia("Nils Pils", "Skjenningsgata 10", "9182876681");
        student student1 = new student(student, "S12837");
        ansatt ansatt1 = new ansatt(ansatt, "vaskepersonell");

        ArrayList<ansatt> ansatte = new ArrayList<>();
        ansatte.add(ansatt1);
        ArrayList<student>Studenter = new ArrayList<>();
        try {
            for (ansatt a : ansatte) {
                System.out.println(a.toString());
            }
            for (student s : Studenter) {
                System.out.println(s.toString());
            }
        } catch (Exception e){
            System.out.println("feil " + e);
        }
    }
}
