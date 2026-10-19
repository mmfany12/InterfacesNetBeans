package com.fanny.calcularedad;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtdatos;
    @FXML private Label lblResultado;

    @Override
    public void initialize (URL url, ResourceBundle rb){
    }
    
    @FXML
    private void btnControl_click1() throws IOException {
        String textoFecha = txtdatos.getText().trim();
        String[] partes = textoFecha.split("/");
        int diaNac = Integer.parseInt(partes[0]); //tipo de dato, variable, extraerdias de arreglo
        int mesNac = Integer.parseInt(partes[1]);
        int añoNac = Integer.parseInt(partes[2]);
        
        LocalDate fechaActual = LocalDate.now();
        
        int edadAños;
        int edadMeses;
        
        int añoActual = fechaActual.getYear(); //tipo dato, variable, definir fecha actual
        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();
        
        edadAños = añoActual - añoNac;
        edadMeses = mesActual - mesNac;
        
        if(mesActual < mesNac || mesActual == mesNac && diaActual < diaNac){
            edadAños = edadAños - 1;
            edadMeses = 12 + (mesActual - mesNac);
        }
        lblResultado.setText("Tienes " + edadAños + " años y " + edadMeses + " meses");
    }
    @FXML
    private void btnControl_click2(){
        txtdatos.setText("");
    }
}
