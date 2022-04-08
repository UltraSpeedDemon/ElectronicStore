package com.example.ethancurtis_assignment2comp1008;

import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;

public class PCBuildController {

    @FXML
    private Button addPart;

    @FXML
    private Button addWish;

    @FXML
    private Label brand;

    @FXML
    private Label locationPlace;

    @FXML
    private Label name;

    @FXML
    private Button nextPart;

    @FXML
    private AnchorPane numPad;

    @FXML
    private Label numParts;

    @FXML
    private Label part;

    @FXML
    private Label price;

    @FXML
    private Label value;

    @FXML
    private TextField wishName;

    @FXML
    private TextField wishPart;


    //loads background
    Image background = new Image(getClass().getResource("img/computerBuild.jpg").toExternalForm());
}
