module com.example.interfacciagrafica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interfacciagrafica to javafx.fxml;
    exports com.example.interfacciagrafica;
}