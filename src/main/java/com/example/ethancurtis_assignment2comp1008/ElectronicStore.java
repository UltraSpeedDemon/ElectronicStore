package com.example.ethancurtis_assignment2comp1008;

public class ElectronicStore {

        /** Instance var **/
        private String brand, name, part;
        private double price;

        /** Constructor **/
        public ElectronicStore(String brand, String name, String part, double price) {
            setBrand(brand);
            setName(name);
            setPart(part);
            setPrice(price);
        }

        /** Setters and Getters **/
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            if (brand.length() >= 4) { /** more than 4 characters **/
                brand.trim(); /** Trim white space **/
                this.brand = brand;
            }
            else{
                throw new IllegalArgumentException("brand must be longer than 4 characters!");
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name.length() >= 2) { /** more than 2 characters **/
                name.trim(); /** Trim white space **/
                this.name = name;
            }
            else{
                throw new IllegalArgumentException("name must be longer than 2 characters!");
            }
        }

        public String getPart() {
            return part;
        }
        public void setPart(String part) {
            if (part.length() >= 2) {  /** more than 2 characters **/
                part.trim(); /** Trim white space **/
                this.part = part;
            }
            else {
                throw new IllegalArgumentException("The part must be 13 numeric characters!");
            }
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if(price >= 0  && price <= 1500){ /** Price must be between 0 and 1500 **/
                this.price = price;
            }
            else {
                throw new IllegalArgumentException("Price must be between $0 and $1500!");
            }
        }
    }
