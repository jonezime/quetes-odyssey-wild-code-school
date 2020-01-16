public abstract class Vehicle {

    //attributs
    private String brand;
    private int kilometers;

    //constructeur
    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    //getters
    public String getBrand() {
        return this.brand;
    } 
    public int getKm() {
        return this.kilometers;
    } 

    //setters

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKm(int kilometers) {
        this.kilometers = 0;
    }

    //methode abstraite
    public abstract String doStuff();




}