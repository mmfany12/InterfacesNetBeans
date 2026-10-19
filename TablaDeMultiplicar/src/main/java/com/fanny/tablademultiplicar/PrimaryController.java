package com.fanny.tablademultiplicar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtNumero;
    @FXML private TextArea txtMultiplos;
    
    @Override
    public void initialize (URL url, ResourceBundle rb){
    }
    
    @FXML
    private void btnCalcular_click1() throws IOException {
        int numeroI = Integer.parseInt(txtNumero.getText().trim());
        String cadTabla = "";
        
        for(int i = 1; i <= 10; i++){
            int res = numeroI * i;
            cadTabla += numeroI + " x " + i + " = " +  res + "\n";
        }
        txtMultiplos.setText(cadTabla);
    }
    @FXML
    private void btnLimpiar_click2() {
        txtNumero.setText("");
        txtMultiplos.setText("");
    }
}
