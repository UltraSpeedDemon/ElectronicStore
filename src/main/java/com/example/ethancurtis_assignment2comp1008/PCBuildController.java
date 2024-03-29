package com.example.ethancurtis_assignment2comp1008;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;

public class PCBuildController implements Initializable {


    @FXML
    private ImageView IvOne;

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

    //part images
    Image graphicsCard = new Image(getClass().getResource("img/graphicsCard.png").toExternalForm());
    Image cpu = new Image(getClass().getResource("img/cpu.png").toExternalForm());
    Image cpufan = new Image(getClass().getResource("img/cpufan.png").toExternalForm());
    Image motherboard = new Image(getClass().getResource("img/motherboard.png").toExternalForm());
    Image ram = new Image(getClass().getResource("img/ram.png").toExternalForm());
    Image pcCase = new Image(getClass().getResource("img/case.png").toExternalForm());


    /** Variable/Flag **/
    int i = 0;

    /** initialize/Jumpstart the application with initial values**/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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

        //start with graphics card
        IvOne.setImage(graphicsCard);
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
        locationPlace.setText(computer.getLocation());
    }
    int j = 0;
    @FXML
    private void displayComputerBuild(Computer computerBuild1) {
        /** Electronic Store / Computer Info **/
        j++;
        numParts.setText(Integer.toString(j));
        value.setText(computerBuild1.getComputerValue());
    }
    Computer computerBuild1 = new Computer("510 Bryne Drive, ON L4N 9P6");

    @FXML
    private Computer btnAddPartPushed() { /** Add Part Pushed **/
        if(i < 6) {
            ElectronicStore part1 = new ElectronicStore("Nvidia", "RTX 3070", "Graphics Card", 1199.19);
            ElectronicStore part2 = new ElectronicStore("Cooler Master", "Hyper 212 Black", "CPU Fan", 59.89);
            ElectronicStore part3 = new ElectronicStore("Intel", "I7-9700K", "CPU", 745.49);
            ElectronicStore part4 = new ElectronicStore("Asus", "Z-390 Prime", "MotherBoard", 329.29);
            ElectronicStore part5 = new ElectronicStore("G-SKILL", "Trident-Z 32GB", "Ram", 282.59);
            ElectronicStore part6 = new ElectronicStore("Corsair", "275R Mid-Tower", "Case", 109.29);
            if (i == 0) {
                computerBuild1.addPart(part1);
                i++;
            } else if (i == 1) {
                computerBuild1.addPart(part2);
                i++;
            } else if (i == 2) {
                computerBuild1.addPart(part3);
                i++;
            } else if (i == 3) {
                computerBuild1.addPart(part4);
                i++;
            } else if (i == 4) {
                computerBuild1.addPart(part5);
                i++;
            } else if (i == 5) {
                computerBuild1.addPart(part6);
                i++;
            } else if (i == 6) {
                i = 0; /** Resets the loops of parts in case **/
            } else {
                i = 0;
            }
            btnNextPartPushed();
            displayComputerBuild(computerBuild1); /** Starts the display method **/
        }
         else{
             i = 0; /** Resets Loop **/
         }
         return computerBuild1;
    }

    int wishListTotal = 0;
    int w = 0;
    @FXML
    private void displayWishParts(Computer wishList){
        ElectronicStore wishList1 = wishList.getParts(w);
        recentPartHeader.setText("Part:");
        recentNameHeader.setText("Name:");
        recentPart.setText(wishList1.getPart());
        recentName.setText(wishList1.getName());
    }
    @FXML
    private void btnAddWishPushed() //TEXTFIELDS MUST BE FILLED IN OR EXCEPTION ERROR WILL OCCUR
    {
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
    private void toAFile(Computer computer) //We haven't learned to a file so, this is based on the internet. NOT CALLED METHOD
    {
        /** Method to write instances to a file **/
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("img/Instances.txt"), "utf-8"));
            writer.write("Instance Test");
        } catch (IOException ex) {
            // Report
        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
    }
    @FXML
    private int btnNextPartPushed(){
        if(i < 6){
            IvOne.setImage(graphicsCard);
            i++;
            if(i == 1){
                IvOne.setImage(cpufan);
            }
            else if(i == 2){
                IvOne.setImage(cpu);
            }
            else if(i == 3){
                IvOne.setImage(motherboard);
            }
            else if(i == 4){
                IvOne.setImage(ram);
            }
            else if(i == 5){
                IvOne.setImage(pcCase);
            }
            else if(i == 6){
                i = 0; /** Resets the loops of parts in case **/
            }


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
        return i;
    }
}
