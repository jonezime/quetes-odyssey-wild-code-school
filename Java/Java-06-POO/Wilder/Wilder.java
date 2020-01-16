public class Wilder {

    //attributs 
    private String firstname;
    private boolean aware;

    //constructeur
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = true;
        
    }

    // méthode instanciée (objet)
    public String whoAmI(String firstname, boolean aware) {
        if (aware) {
            return "Je m'appelle " + this.getName() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getName() + " et je ne suis pas aware";
        }
    }

    //getters
    public String getName() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    // setters
    public void setName(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }


}