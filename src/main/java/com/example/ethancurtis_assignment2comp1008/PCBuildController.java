package com.example.ethancurtis_assignment2comp1008;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;

public class PCBuildController implements Initializable {

    @FXML
    private Label brand;

    @FXML
    private Button btnAddPart;

    @FXML
    private Button btnAddWish;

    @FXML
    private Button btnNextPart;

    @FXML
    private Label locationPlace;

    @FXML
    private Label name;

    @FXML
    private TextField nameWish;

    @FXML
    private AnchorPane numPad;

    @FXML
    private Label numParts;

    @FXML
    private Label numWish;

    @FXML
    private Label part;

    @FXML
    private TextField partWish;

    @FXML
    private Label price;

    @FXML
    private Label recentName;

    @FXML
    private Label recentNameHeader;

    @FXML
    private Label recentPart;

    @FXML
    private Label recentPartHeader;

    @FXML
    private Label value;

    //loads background
    Image background = new Image(getClass().getResource("img/computerBuild.jpg").toExternalForm());

    /** Variable/Flag **/
    int i = 0;

    /** initialize/Jumpstart the application with initial values**/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Computer computerBuild = new Computer("510 Bryne Drive,ON L4N 9P6");
        ElectronicStore part1 = new ElectronicStore("Nvidia","RTX 3070","Graphics Card",1199.19);
        ElectronicStore part2 = new ElectronicStore("Cooler Master","Hyper 212 Black","CPU Fan",59.89);
        ElectronicStore part3 = new ElectronicStore("Intel","I7-9700K","CPU",745.49);
        ElectronicStore part4 = new ElectronicStore("Asus","Z-390 Prime","MotherBoard",329.29);
        ElectronicStore part5 = new ElectronicStore("G-SKILL","Trident-Z 32GB","Ram",282.59);
        ElectronicStore part6 = new ElectronicStore("Corsair","275R Mid-Tower","Case",109.29);
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
    int wishListTotal = 0;
    @FXML
    private void displayWishParts(Computer wishList){
        ElectronicStore wishList1 = wishList.getParts(i);
        recentPartHeader.setText("Part:");
        recentNameHeader.setText("Name:");
        recentPart.setText(wishList1.getPart());
        recentName.setText(wishList1.getName());
    }
    @FXML
    private void btnAddWishPushed() //TEXTFIELDS MUST BE FILLED IN OR EXCPETION ERROR WILL OCCUR
    {
        int i = 0;
        String wishPart = partWish.getText();
        String wishName = nameWish.getText();
        nameWish.setText(""); //clears textfields
        partWish.setText(""); //clears textfields
        Computer wishList = new Computer("510 Bryne Drive, ON L4N 9P6"); //same location
        ElectronicStore wish1 = new ElectronicStore("TestingRandomWishBrand",wishName,wishPart,10.00);//random brand and price values
            wishList.addPart(wish1);
        wishListTotal = wishListTotal + 1;
        numWish.setText(""+wishListTotal);

        displayWishParts(wishList); /** Starts the display method to send to displayWishParts method with wishlist arraylist **/
    }
    @FXML
    private void btnNextPartPushed(){
        if(i < 5){
            i++;
            Computer computerBuild = new Computer("510 Bryne Drive, ON L4N 9P6");
            ElectronicStore part1 = new ElectronicStore("Nvidia","RTX 3070","Graphics Card",1199.19);
            ElectronicStore part2 = new ElectronicStore("Cooler Master","Hyper 212 Black","CPU Fan",59.89);
            ElectronicStore part3 = new ElectronicStore("Intel","I7-9700K","CPU",745.49);
            ElectronicStore part4 = new ElectronicStore("Asus","Z-390 Prime","MotherBoard",329.29);
            ElectronicStore part5 = new ElectronicStore("G-SKILL","Trident-Z 32GB","Ram",282.59);
            ElectronicStore part6 = new ElectronicStore("Corsair","275R Mid-Tower","Case",109.29);
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
