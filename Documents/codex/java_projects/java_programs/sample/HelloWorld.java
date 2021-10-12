package sample;

import sample.*;

public class HelloWorld {

    private String sirName = "pratap";

    public String getSirName() {
        return sirName;
    }

    public static void main(String[] args) {
        // Circle c = new Circle();
        // c.x = 21;
        String myName = Circle.printName();
        HelloWorld h = new HelloWorld();
        System.out.println(
                "Welcome to the world of Java Mr " + h.getSirName() + " and the value of x in c is: " + myName);
    }
}
