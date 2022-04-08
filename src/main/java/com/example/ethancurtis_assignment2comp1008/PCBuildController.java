package com.example.ethancurtis_assignment2comp1008;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PCBuildController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Computer Build!");
    }

}