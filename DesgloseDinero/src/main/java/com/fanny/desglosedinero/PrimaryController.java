package com.fanny.desglosedinero;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtDinero;
    @FXML private TextArea txtDatos;
    @FXML private TextArea txtValor;
    
    @Override
    public void initialize (URL url, ResourceBundle rb){
    }

    @FXML
    private void btnControl_click1() throws IOException {
        int totalDinero = Integer.parseInt(txtDinero.getText().trim());
        int cantidad500, cantidad200, cantidad100, cantidad50, cantidad20, cantidad10, cantidad5, cantidad2, cantidad1, 
                residuo1, residuo2, residuo3, residuo4, residuo5, residuo6, residuo7, residuo8;
        
        cantidad500 = totalDinero / 500;
        residuo1 = totalDinero % 500;
        
        cantidad200 = residuo1 / 200;
        residuo2 = residuo1 % 200;
        
        cantidad100 = residuo2 / 100;
        residuo3 = residuo2 % 100;
        
        cantidad50 = residuo3 / 50;
        residuo4 = residuo3 % 50;
        
        cantidad20 = residuo4 / 20;
        residuo5 = residuo4 % 20;
        
        cantidad10 = residuo5 / 10;
        residuo6 = residuo5 % 10;
        
        cantidad5 = residuo6 / 5;
        residuo7 = residuo6 % 5;
        
        cantidad2 = residuo7 / 2;
        residuo8 = residuo7 % 2;
        
        cantidad1 = residuo8 / 1;
        
        txtDatos.setText("Billetes de $500" + "\n" + "Billetes de $200" + "\n" + "Billetes de $100" + "\n" + "Billetes de $50" + "\n" + "Billetes de $20" + "\n" + "Monedas de $10" + "\n" + "Monedas de $5" + "\n" + "Monedas de $2" + "\n" + "Monedas de $1");
        txtValor.setText(cantidad500 + "\n" + cantidad200 + "\n" + cantidad100 + "\n" + cantidad50 + "\n" + cantidad20 + "\n" + cantidad10 + "\n" + cantidad5 + "\n" + cantidad2 + "\n" + cantidad1);
    }
    @FXML
    private void btnControl_click2() {
        txtDinero.setText("");
        txtDatos.setText("");
        txtValor.setText("");
    }
}
