module com.fanny.calcularedad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fanny.calcularedad to javafx.fxml;
    exports com.fanny.calcularedad;
}
