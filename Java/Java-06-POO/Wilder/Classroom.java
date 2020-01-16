public class Classroom {

    public static void main(String[] args) {

        Wilder a = new Wilder("Jean-Claude", true);
        System.out.println(a.whoAmI("Jean-Claude", true));
        
        Wilder b = new Wilder("Henri", false);
        System.out.println(b.whoAmI("Henri", false));

    }
}