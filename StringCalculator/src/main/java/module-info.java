module org.example.stringcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.stringcalculator to javafx.fxml;
    exports org.example.stringcalculator;
}