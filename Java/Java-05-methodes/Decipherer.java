class Decipherer {
    public static void main(String[] args) {

        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        System.out.println(Decipherer.decrypt(message1));
        System.out.println(Decipherer.decrypt(message2));
        System.out.println(Decipherer.decrypt(message3));
    }

    public static StringBuilder decrypt(String message) {

        int keyLength = message.length() / 2;

        String subMessageLength = message.substring(5, 5 + keyLength);

        String newMessage = subMessageLength.replace("@#?", " ");

        new StringBuilder(newMessage).reverse().toString();
        StringBuilder dest = new StringBuilder(newMessage);
        StringBuilder reverseStr = dest.reverse();

        return reverseStr;

    }

}