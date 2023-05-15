module com.example.javafxdz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxdz to javafx.fxml;
    exports com.example.javafxdz;
}