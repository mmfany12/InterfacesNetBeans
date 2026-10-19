module com.fanny.desglosedinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fanny.desglosedinero to javafx.fxml;
    exports com.fanny.desglosedinero;
}
