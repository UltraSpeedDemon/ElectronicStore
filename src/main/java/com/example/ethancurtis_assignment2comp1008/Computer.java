package com.example.ethancurtis_assignment2comp1008;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Computer {
    /** Instance Variables **/
    private String location;
    private ArrayList<ElectronicStore> parts; /** Empty array List of computer parts **/


    /** Constructor **/
    public Computer(String location) {
        setLocation(location);
        this.parts = new ArrayList<>(); /**Initialize the List **/
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location.length() >= 10) {
            this.location = location;
        }
        else{
            throw new IllegalArgumentException("The Location MUST have 10 or more characters!"); //Validation
        }
    }
    public void addPart(ElectronicStore part){ /** Adds part to arraylist **/
        parts.add(part);
    }
    public int getNumOfParts(){ /** Displays the number of computer parts **/
        int partNum = parts.size();
        return partNum;
    }

    private static final DecimalFormat df = new DecimalFormat("0.00"); //decimal format

    public String getComputerValue(){ /** returns parts from Electronic Store by adding all of their prices **/
        double totalPrice = 0;
        for (ElectronicStore part : parts)
            totalPrice += part.getPrice();
        String output = df.format(totalPrice);
        return output;
    }

    public String getParts(){ /** contains all of the parts in the Computer Build**/ //unused in final product
        String partList = "";
        for (ElectronicStore part : parts)
            partList += (part.getPart() + ",");
        partList = partList.substring(0,partList.length()-2); /** Cuts off last comma **/
        return partList;
    }

    public ArrayList<String> getPartsInBrand(String part) /** has a part as an argument and displays all the parts in that brand*/ //unused in final product
    {
        ArrayList<String> Build = new ArrayList<>(); /** New array lis to hold books **/

        for (int i = 0; i < parts.size(); i++) /** Calls the all the parts **/ {
            if (parts.get(i).getBrand() == part) /** if Brand in the list of parts **/ {
                Build.add(parts.get(i).getName()); /** Adds it with the Name **/
            }
        }
        return Build;
    }
    public ElectronicStore getParts(int j){ /** gets the books from the library **/
        return parts.get(j);
    }
}