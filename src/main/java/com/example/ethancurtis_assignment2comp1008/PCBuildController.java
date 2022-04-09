package com.example.ethancurtis_assignment2comp1008;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;

public class PCBuildController implements Initializable {

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
    private TextField partName;

    @FXML
    private TextField partWish;

    @FXML
    private Label price;

    @FXML
    private Label value;

    //loads background
    Image background = new Image(getClass().getResource("img/computerBuild.jpg").toExternalForm());

    /** Variable/Flag **/
    int i = 0;

    /** initialize/Jumpstart the application with intial values**/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Computer computerBuild = new Computer("510 Bryne Drive,ON L4N 9P6");
        ElectronicStore part1 = new ElectronicStore("Nvidia","RTX 3070","Graphics Card",1199.99);
        ElectronicStore part2 = new ElectronicStore("Cooler Master","Hyper 212 Black","CPU Fan",59.99);
        ElectronicStore part3 = new ElectronicStore("Intel","I7-9700K","CPU",745.99);
        ElectronicStore part4 = new ElectronicStore("Asus","Z-390 Prime","MotherBoard",329.99);
        ElectronicStore part5 = new ElectronicStore("G-SKILL","Trident-Z 32GB","Ram",249.99);
        ElectronicStore part6 = new ElectronicStore("Corsair","275R Mid-Tower","Case",109.99);
        computerBuild.addPart(part1);
        computerBuild.addPart(part2);
        computerBuild.addPart(part3);
        computerBuild.addPart(part4);
        computerBuild.addPart(part5);
        computerBuild.addPart(part6);

        displayComputerParts(computerBuild); /** Starts the display method **/
    }


    /** This method will display the values **/
    @FXML
    private void displayComputerParts(Computer computer){
        ElectronicStore parts = computer.getParts(i);
        /** Parts **/
        part.setText(parts.getPart());
        price.setText(Double.toString(parts.getPrice()));
        brand.setText(parts.getBrand());
        name.setText(parts.getName());

        /** Elecrontic Store / Computer Info **/
        numParts.setText(Integer.toString(computer.getNumOfParts()));
        value.setText(Double.toString(computer.getComputerValue()));
        locationPlace.setText(computer.getLocation());
    }
    @FXML
    private void btnNextPartPushed(){
        if(i < 5){
            i++;
            Computer computerBuild = new Computer("510 Bryne Drive Unit A-E, Barrie, ON L4N 9P6");
            ElectronicStore part1 = new ElectronicStore("Nvidia","RTX 3070","Graphics Card",1199.99);
            ElectronicStore part2 = new ElectronicStore("Cooler Master","Hyper 212 Black","CPU Fan",59.99);
            ElectronicStore part3 = new ElectronicStore("Intel","I7-9700K","CPU",745.99);
            ElectronicStore part4 = new ElectronicStore("Asus","Z-390 Prime","MotherBoard",329.99);
            ElectronicStore part5 = new ElectronicStore("G-SKILL","Trident-Z 32GB","Ram",249.99);
            ElectronicStore part6 = new ElectronicStore("Corsair","275R Mid-Tower","Case",109.99);
            computerBuild.addPart(part1);
            computerBuild.addPart(part2);
            computerBuild.addPart(part3);
            computerBuild.addPart(part4);
            computerBuild.addPart(part5);
            computerBuild.addPart(part6);

            displayComputerParts(computerBuild); /** Starts the display method **/
        }
        else {
            i = 0; /** Resets the loops of parts **/
        }
    }
}
