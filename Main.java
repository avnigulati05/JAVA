import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
        String[] nameParts = fullName.split(" "); 

        String abbreviatedName = "";

        for (int i = 0; i < nameParts.length - 1; i++) {
            abbreviatedName += nameParts[i].charAt(0) + ".";
        }
        abbreviatedName += nameParts[nameParts.length - 1];

        System.out.println("The abbreviated name is: " + abbreviatedName);
    }
}