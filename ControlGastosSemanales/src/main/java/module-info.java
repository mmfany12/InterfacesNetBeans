module com.fanny.controlgastossemanales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fanny.controlgastossemanales to javafx.fxml;
    exports com.fanny.controlgastossemanales;
}
