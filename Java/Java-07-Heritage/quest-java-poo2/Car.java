public class Car extends Vehicle {

    //construteur
    public Car(String brand) {
        super(brand);
    }

    //implémentation
    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }
}