// package Cube.IO;

import java.util.Scanner;

public class Input {
    public static void input() {
        try (Scanner sc = new Scanner(System.in)) {
            String White = "";
            String Yellow = "";
            String Red = "";
            String Orange = "";
            String Green = "";
            String Blue = "";

            System.out.println("The 6 faces of a cube are:");
            System.out.println("1. White (W)");
            System.out.println("2. Yellow (Y)");
            System.out.println("3. Red (R)");
            System.out.println("4. Orange (O)");
            System.out.println("5. Green (G)");
            System.out.println("6. Blue (B)");

            System.out.println();

            System.out.println("Enter the colors in this format: ");
            System.out.println("1 2 3");
            System.out.println("4 5 6");
            System.out.println("7 8 9");
            System.out.println("WWWWWWWWW");
            System.out.println();

            System.out.println("Enter the White face cube colors: ");
            White = sc.nextLine();
            System.out.println("Enter the Yellow face cube colors: ");
            Yellow = sc.nextLine();
            System.out.println("Enter the Red face cube colors: ");
            Red = sc.nextLine();
            System.out.println("Enter the Orange face cube colors: ");
            Orange = sc.nextLine();
            System.out.println("Enter the Green face cube colors: ");
            Green = sc.nextLine();
            System.out.println("Enter the Blue face cube colors: ");
            Blue = sc.nextLine();

            if (White.length() != 9 || Yellow.length() != 9 || Red.length() != 9 || Orange.length() != 9
                    || Green.length() != 9 || Blue.length() != 9) {
                System.out.println("Invalid input. Please try again.");
            }

            System.out.println("The cube is: ");
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        System.out.println("White face: ");
                        printCube(White);
                        break;
                    case 1:
                        System.out.println("Yellow face: ");
                        printCube(Yellow);
                        break;
                    case 2:
                        System.out.println("Red face: ");
                        printCube(Red);
                        break;
                    case 3:
                        System.out.println("Orange face: ");
                        printCube(Orange);
                        break;
                    case 4:
                        System.out.println("Green face: ");
                        printCube(Green);
                        break;
                    case 5:
                        System.out.println("Blue face: ");
                        printCube(Blue);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    public static void printCube(String color) {
        for (int i = 0; i < 9; i++) {
            System.out.print(color.charAt(i) + " ");
            if (i == 2 || i == 5 || i == 8) {
                System.out.println();
            }
        }

    }
}
