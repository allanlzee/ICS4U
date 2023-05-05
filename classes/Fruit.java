package classes;

public class Fruit {
    private String name = ""; 
    private String originCountry = ""; 
    private double price = 0; 

    public Fruit() {
        this.name = ""; 
        this.originCountry = "";
        this.price = 0; 
    }

    public Fruit(String name, String originCountry, double price) {
        this.name = name; 
        this.originCountry = originCountry; 
        this.price = price; 
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" 
             + "Origin Country: " + originCountry + "\n" 
             + "Price: " + price; 
    }

    public String getName() {
        return this.name; 
    }

    public String getOriginCountry() {
        return this.originCountry; 
    }

    public double getPrice() {
        return this.price; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry; 
    }

    public void setPrice(double price) {
        this.price = price; 
    }
}

