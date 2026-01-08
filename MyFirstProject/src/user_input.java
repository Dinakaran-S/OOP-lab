import java.util.Scanner;

public class user_input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your name: ");
        String name = scanner.nextLine();


        System.out.println(" Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println(" Enter your address: ");
        String address = scanner.nextLine();

        System.out.println("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " +name+ " you ar" +age+ " old your address is " +address);
        System.out.println(gpa);
        System.out.println(isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are NOT enrolled");
        }

        scanner.close();
    }
}


