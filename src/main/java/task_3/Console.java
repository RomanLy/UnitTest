package task_3;

import java.util.Scanner;

public class Console {

    static Scanner scanner = new Scanner(System.in);

    public static String[] split() {
        System.out.println("Please enter <name>, <side1>, <side2>, <side3>");
        String in = scanner.nextLine();
        return in.split(",");
    }

    public static Triangle parseInPutLine() {
        String[] words = split();
        String name = words[0];
        double side1 = Double.parseDouble(words[1]);
        double side2 = Double.parseDouble(words[2]);
        double side3 = Double.parseDouble(words[3]);
        if (Validator.isTriangleExist(side1, side2, side3)) {
            return new Triangle(name, side1, side2, side3);
        } else {
            System.out.println("Triangle cannot be create");
        }
        return null;
    }

    protected static String scan() {
        System.out.println("Do you want to add new triangle (enter Yes(Y) / No(N))");
        return scanner.nextLine();
    }

    public static boolean confirm() {
        String inPut = scan();
        switch (inPut.toLowerCase()) {
            case "yes":
                return true;
            case "y":
                return true;
            case "no":
                return false;
            case "n":
                return false;
        }
        return false;
    }

    public static void print(Triangle triangle){
        System.out.println(triangle);
    }
}
