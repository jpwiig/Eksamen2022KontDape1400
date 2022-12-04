package Task4;

import java.awt.*;
import java.awt.event.ActionEvent;


public class ForbrenningController {
    @FXML
    private  Togglegroup Kjonn; // Mann, Kvinne
    @FXML
    private TextField txtAlder;
    @FXML
    private TextField txtVekt;
    @FXML
    private TextField txtHoyde;
    @FXML
    private Label lblResultat;
    /*
    Kvinner: Energibehov = (10 · vekt) + (6,25 · høyde) − (5 · alder) − 161
    Menn: Energibehov = (10 · vekt) + (6,25 · høyde) − (5 · alder) + 5
    Stillesittende aktivitetsnivå ganges dette med 1.5
     */
    @FXML
    void btnBeregn(ActionEvent event) {
        String toggle = Kjonn.toString(); //Ta denne med en liten klype salt da jeg er veldig usikker på hvordan togglegroup fungerer. les mer om togglegroup på: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/ToggleGroup.html
        try{
            if (toggle.equals("mann") || toggle.equals("Mann")) { //hvis det er mann
                lblResultat.setText( Double.toString(forbrenningMann(Double.parseDouble(txtVekt.getText()),Integer.parseInt(txtHoyde.getText()), Integer.parseInt(txtAlder.getText()))));
            }
            if (toggle.equals("kvinne") || toggle.equals("Kvinne")) { //hvis det er kvinne
            lblResultat.setText(Double.toString(forbrenningkvinne(Double.parseDouble(txtVekt.getText()), Integer.parseInt(txtHoyde.getText()), Integer.parseInt(txtAlder.getText()))));
            }
        }catch (Exception e){ //feilmelding da vi tar innput
            System.out.println("feil " + e);
        }
    }
    private static  double forbrenningMann(double vekt, int hoyde, int alder ){
    double sum = (10 * vekt) + (6.25 * hoyde)  + (5 * alder) + 5; //formel for menn
    return sum; //ferdigregnet
    } //utregning av mann, se formel i eksamen, jeg har valgt å bruke double for å være mer nøyaktig, men er litt mindre effektivt, da double bruker mer plass i  minnet
    private static  double forbrenningkvinne(double vekt, int hoyde, int alder ){
        double sum = (10 * vekt) + (6.25 * hoyde)  + (5 * alder) - 161; //formel for kvinner
        return sum; //returner ferdigregnet sum
    }

}
