public class Zadanie2 {
    public static void main(String[] args) {
        Cup cup1 = new Cup();
        Cup cup2 = new Cup();

        cup1.cupColor = "Czerwony";
        cup1.cupCapacity = 250;
        cup1.cupHeight = 10.5;
        cup1.cupType = "Kubek";

        cup2.cupColor = "Transparentny";
        cup2.cupCapacity = 500;
        cup2.cupHeight = 13.8;
        cup2.cupType = "Kufel";


        System.out.println(cup1.cupColor + " " + cup1.cupType + " Pojemność: " + cup1.cupCapacity + " Wysokość: " + cup1.cupHeight);
        System.out.println(cup2.cupColor + " " + cup2.cupType + " Pojemność: " + cup2.cupCapacity + " Wysokość: " + cup2.cupHeight);

    }
}
