package com.fanny.controlgastossemanales;

import java.io.IOException;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotal;
    @FXML private TextField txtGasAlto;
    
    @Override
    public void initialize (URL url, ResourceBundle rb){
    }
    
    @FXML
    private void btnCalcular_click1() throws IOException {
        
        int valor1 = Integer.parseInt(txtAlimentacion.getText().trim());
        int valor2 = Integer.parseInt(txtRefrigerios.getText().trim());
        int valor3 = Integer.parseInt(txtTransporte.getText().trim());
        int valor4 = Integer.parseInt(txtTelefonia.getText().trim());
        int valor5 = Integer.parseInt(txtOtros.getText().trim());
        
        int total = valor1 + valor2 + valor3 + valor4 + valor5;
        
        int mayor = valor1;
        String catMayor = "Alimentación";
        if(valor2 > mayor){
            mayor = valor2;
            catMayor = "Refrigerios";
        }
        if(valor3 > mayor){
            mayor = valor3;
            catMayor = "Transporte";
        }
        if(valor4 > mayor){
            mayor = valor4;
            catMayor = "Telefonía";
        }
        if(valor5 > mayor){
            mayor = valor5;
            catMayor = "Otros";
        }
    
        txtTotal.setText(String.valueOf(total));
        txtGasAlto.setText(String.valueOf(catMayor));
    }
    @FXML
    private void btnLimpiar_click2(){
        txtAlimentacion.setText("");
        txtRefrigerios.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        txtTotal.setText("");
        txtGasAlto.setText("");
    }
}
