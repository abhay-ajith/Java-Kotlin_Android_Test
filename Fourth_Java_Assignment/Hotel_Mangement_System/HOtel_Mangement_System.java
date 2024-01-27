// Hotel Manahgement System 

package Hotel_Mangement_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Room class 
abstract class Room {
    private int roomNumber;
    private double rate;

    public Room(int roomNumber, double rate) {
        this.roomNumber = roomNumber;
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getRate() {
        return rate;
    }

    public abstract String getRoomType();
}

class StandardRoom extends Room {
    public StandardRoom(int roomNumber) {
        super(roomNumber, 1000.0); // Standard room rate
    }

    @Override
    public String getRoomType() {
        return "Standard Room";
    }
}

class LuxuryRoom extends Room {
    public LuxuryRoom(int roomNumber) {
        super(roomNumber, 2000.0); // Deluxe room rate
    }

    @Override
    public String getRoomType() {
        return "Deluxe Room";
    }
}

// Guest class
class Guest {
    private String guestName;
    private String guestEmail;

    public Guest(String guestName, String guestEmail) {
        this.guestName = guestName;
        this.guestEmail = guestEmail;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getGuestEmail() {
        return guestEmail;
    }
}

// Reservation class
class Reservation {
    private Room room;
    private Guest guest;
    private int nights;

    public Reservation(Room room, Guest guest, int nights) {
        this.room = room;
        this.guest = guest;
        this.nights = nights;
    }

    public double calculateTotalBill() {
        return room.getRate() * nights;
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }

    public int getNights() {
        return nights;
    }
}

// Hotel class to manage rooms and reservations
class Hotel {
    List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel() {
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        // Add some standard and deluxe rooms
        for (int i = 1; i <= 5; i++) {
            rooms.add(new StandardRoom(i));
            rooms.add(new LuxuryRoom(i + 10));
        }
    }

    public void displayRoomAvailability() {
        System.out.println("Room Availability:");
        for (Room room : rooms) {
            System.out.println(room.getRoomNumber() + " - " + room.getRoomType() +
                    " - Rate: $" + room.getRate());
        }
    }

    public void bookRoom(Room selectedRoom, Guest guest, int nights) {
        Reservation reservation = new Reservation(selectedRoom, guest, nights);
        reservations.add(reservation);
        System.out.println("Room booked successfully!");
        System.out.println("Total Bill: $" + reservation.calculateTotalBill());
    }

    public void displayReservations() {
        System.out.println("Current Reservations:");
        for (Reservation reservation : reservations) {
            System.out.println("Room: " + reservation.getRoom().getRoomNumber() +
                    " - Guest: " + reservation.getGuest().getGuestName() +
                    " - Nights: " + reservation.getNights() +
                    " - Total Bill: $" + reservation.calculateTotalBill());
        }
    }
}

// Main class to demonstrate the usage
public class HOtel_Mangement_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hotel hotel = new Hotel();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Display Room Availability");
            System.out.println("2. Book a Room");
            System.out.println("3. Display Reservations");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayRoomAvailability();
                    break;

                case 2:
                    System.out.println("Enter your name:");
                    String guestName = scanner.next();
                    System.out.println("Enter your email:");
                    String guestEmail = scanner.next();
                    Guest guest = new Guest(guestName, guestEmail);

                    System.out.println("Enter the room number to book:");
                    int roomNumber = scanner.nextInt();

                    Room selectedRoom = null;
                    for (Room room : hotel.rooms) {
                        if (room.getRoomNumber() == roomNumber) {
                            selectedRoom = room;
                            break;
                        }
                    }

                    if (selectedRoom != null) {
                        System.out.println("Enter the number of nights to stay:");
                        int nights = scanner.nextInt();
                        hotel.bookRoom(selectedRoom, guest, nights);
                    } else {
                        System.out.println("Invalid room number.");
                    }
                    break;

                case 3:
                    hotel.displayReservations();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}