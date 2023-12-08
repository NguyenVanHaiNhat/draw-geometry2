import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");

            choice = input.nextInt();
            switch (choice){
                case 1:
                    int widthRec, heightRec;
                    System.out.println("Enter the width");
                    widthRec = input.nextInt();
                    System.out.println("Enter the height");
                    heightRec = input.nextInt();
                    for (int i = 0; i < widthRec; i++) {
                        for (int j = 0; j < heightRec; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int size = 5;
                    System.out.println("Top-left corner:");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nTop-right corner:");
                    for (int i = 0; i < size; i++) {
                        for (int j = size; j > i + 1; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nBottom-left corner:");
                    for (int i = 0; i < size; i++) {
                        for (int j = size; j > i; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nBottom-right corner:");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = size; k > i; k--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int width1;
                    System.out.println("Enter the width");
                    width1 = input.nextInt();
                    for (int i = 0; i < width1; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = width1; k > i; k--) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
