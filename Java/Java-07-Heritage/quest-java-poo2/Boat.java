public class Boat extends Vehicle {

    //construteur
    public Boat(String brand) {
       super(brand);
    }
    
    //implémentation
    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais glouglou !";
    }
}