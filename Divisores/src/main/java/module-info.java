module com.fanny.divisores {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fanny.divisores to javafx.fxml;
    exports com.fanny.divisores;
}
