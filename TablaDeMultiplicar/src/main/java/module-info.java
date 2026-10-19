module com.fanny.tablademultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fanny.tablademultiplicar to javafx.fxml;
    exports com.fanny.tablademultiplicar;
}
