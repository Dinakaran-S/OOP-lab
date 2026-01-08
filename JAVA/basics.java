import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        // Calculate the rectangle
        Scanner area = new Scanner(System.in);

        System.out.println("Write the length: ");
        int length = area.nextInt();
        System.out.println("Write the breadth: ");
        int breadth = area.nextInt();
        area.close();
    }
}