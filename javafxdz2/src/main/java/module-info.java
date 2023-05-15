module com.example.javafxdz2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxdz2 to javafx.fxml;
    exports com.example.javafxdz2;
}