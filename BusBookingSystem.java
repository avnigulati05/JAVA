import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BusBookingSystem {
    private int totalSeats;
    private ArrayList<Integer> availableSeats;
    private HashMap<Integer, Double> seatPrices;

    public BusBookingSystem(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            availableSeats.add(i);
        }
        this.seatPrices = new HashMap<>();
        for (int seatNo : availableSeats) {
            seatPrices.put(seatNo, 100.0);
        }
    }

    public void bookSeat(int numSeats) {
        if (numSeats > availableSeats.size()) {
            System.out.println("Sorry, there are not enough available seats.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Seats: " + availableSeats);
        ArrayList<Integer> selectedSeats = new ArrayList<>();
        for (int i = 0; i < numSeats; i++) {
            int seatNo;
            do {
                System.out.print("Select seat " + (i + 1) + "/" + numSeats + ": ");
                seatNo = scanner.nextInt();
                if (!availableSeats.contains(seatNo)) {
                    System.out.println("Seat " + seatNo + " is not available. Please select another seat.");
                }
            } while (!availableSeats.contains(seatNo));

            selectedSeats.add(seatNo);
            availableSeats.remove(Integer.valueOf(seatNo));
        }

        for (int seatNo : selectedSeats) {
            if (seatNo % 3 == 0) {
                seatPrices.put(seatNo, seatPrices.get(seatNo) * 1.3);
            }
        }

        double totalAmount = 0;
        for (int seatNo : selectedSeats) {
            totalAmount += seatPrices.get(seatNo);
        }
        System.out.println("Seats booked successfully!");
        System.out.println("Total Amount: " + totalAmount);
    }

    public static void main(String[] args) {
        int totalSeats = 30;
        BusBookingSystem busSystem = new BusBookingSystem(totalSeats);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Do you want to book a seat? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();
            if (choice.equals("yes")) {
                System.out.print("How many seats do you want to book? ");
                int numSeats = scanner.nextInt();
                busSystem.bookSeat(numSeats);
            } else if (choice.equals("no")) {
                System.out.println("Thank you for using our bus booking system.");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }
        }
    }
}
