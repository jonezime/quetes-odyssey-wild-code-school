public class Hangar {

    public static void main(String[] args) {

        Car a = new Car("Clio");
        Boat b = new Boat("Titanic");

        System.out.println(a.doStuff());
        System.out.println(b.doStuff());

    }
}