module com.example.ethancurtis_assignment2comp1008 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ethancurtis_assignment2comp1008 to javafx.fxml;
    exports com.example.ethancurtis_assignment2comp1008;
}