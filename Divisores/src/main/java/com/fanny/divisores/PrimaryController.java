package com.fanny.divisores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtNumero;
    @FXML private TextField txtcantDigitos;
    @FXML private TextField txtsumaPar;
    @FXML private TextField txtsumaImp;
    @FXML private TextField txtsumaTotal;
    @FXML private TextField txtDigMayor;
    @FXML private TextField txtDigMenor;
    @FXML private TextArea txtDivisores;
    
    @Override
    public void initialize (URL url, ResourceBundle rb){
    }

    @FXML
    private void btnControl_click1() throws IOException {
        int numeroTexto = Integer.parseInt(txtNumero.getText().trim());
        int cifraT = Math.abs(numeroTexto);
        
        int cantDigitos = 0;
        int sumaImp = 0;
        int sumaPar = 0;
        int sumaTotal = 0;
        int DigMayor = -1;
        int DigMenor = 10;
        
        if(numeroTexto == 0){
            cantDigitos = 1;
            DigMayor = 0;
            DigMenor = 0;
        }
        else{
            while(cifraT > 0){
                int digito = cifraT % 10;
                cantDigitos++;
                sumaTotal += digito;
                
                if(digito % 2 == 0){
                    sumaPar += digito;
                }
                else{
                    sumaImp += digito;
                }
                if(digito > DigMayor){
                    DigMayor = digito;
                }
                if(digito < DigMenor){
                    DigMenor = digito;
                }
                
                cifraT = cifraT / 10;
                }
            }
            
        String cadDivisores = "";
        for(int i = 1; i <= Math.abs(numeroTexto); i++){
            if(Math.abs(numeroTexto) % i == 0){
                cadDivisores += i + "\n";
            }
        }
        txtcantDigitos.setText(String.valueOf(cantDigitos));
        txtsumaImp.setText(String.valueOf(sumaImp));
        txtsumaPar.setText(String.valueOf(sumaPar));
        txtsumaTotal.setText(String.valueOf(sumaTotal));
        txtDigMayor.setText(String.valueOf(DigMayor));
        txtDigMenor.setText(String.valueOf(DigMenor));
        txtDivisores.setText(cadDivisores);
    }

    @FXML
    private void btnControl_click2() {
        txtNumero.setText("");
        txtcantDigitos.setText("");
        txtsumaPar.setText("");
        txtsumaImp.setText("");
        txtsumaTotal.setText("");
        txtDigMayor.setText("");
        txtDigMenor.setText("");
        txtDivisores.setText("");
    }
}