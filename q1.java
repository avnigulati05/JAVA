import java.util.Scanner;
public class q1{
    public static void main(String args[]){
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of denominations");
        size = scanner.nextInt();

        int[] denominations = new int[size];
        for(int i = 0 ; i< size ; i++){
            System.out.println("Enter the country denomination = ");
            denominations[i] = scanner.nextInt();
        }

        System.out.println("Enter the amount you want to pay = ");
        int amount = scanner.nextInt();
        int count[] = new int[denominations.length];
        // sort(denominations);
        for(int i = 0 ; i < denominations.length ; i++){
            count[i]= amount / denominations[i];
            amount -= count[i] * denominations[i];
        }

        System.out.println("Amount to be paid in denominations = ");
        for (int i = 0; i < denominations.length; i++) {
            if (count[i] > 0) {
                System.out.println(denominations[i] + " : " + count[i]);
            }
        }

    }
}