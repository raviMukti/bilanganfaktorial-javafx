package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FaktorialController implements Initializable {

    int angka;
    String hasil;

    @FXML
    private TextField fieldAngka;

    @FXML
    private Button btnHitung;

    @FXML
    private Button btnClear;

    @FXML
    private Label labelHasil;

    @FXML
    void btnClearAction(ActionEvent event) {
        clearAll();
    }

    @FXML
    void btnHitungAction(ActionEvent event) {
        angka = Integer.valueOf(fieldAngka.getText());
        hasil = String.valueOf(factorial(angka));
        labelHasil.setText(hasil);
    }

    public void initialize(URL location, ResourceBundle resources) {

    }

//    Method untuk menghitung angka faktorial
    static int factorial(int n){
        if (n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

//    Method clear text and field
    void clearAll(){
        fieldAngka.setText("");
        labelHasil.setText("Hasil");
    }
}
