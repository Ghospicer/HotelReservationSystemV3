import java.util.Scanner;


public class HotelReservationSystem {

    public static void main(String[] args) {
        Reservation[] reserv = new Reservation[50];
        Room[] room = new Room[50];
        int id = 1;
        int choice;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Create new Reservation\n");
            System.out.println("2. Create new Reservation with Room Type\n");
            System.out.println("3. Display all Reservations\n");
            System.out.println("4. Display the total number of reservations\n");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            System.out.printf("\n");

            if (choice==1) {
                System.out.println("Hotel Name: ");
                String hotelName = sc.next();
                System.out.println("Reservation Month: ");
                String reservationMonth = sc.next();
                System.out.println("Reservation Start: ");
                int reservationStart = sc.nextInt();
                System.out.println("Reservation End: ");
                int reservationEnd = sc.nextInt();              
                room[id-1] = new Room("Single");
                reserv[id-1] = new Reservation(reservationEnd, reservationStart, reservationMonth, hotelName,room[id-1]);
                System.out.printf("Reservation created!\n");
                System.out.printf("\n");
                Reservation.totalNumofReservations++;
                id++;

            }
            else if (choice==2) {
            	System.out.println("ROOM INFOS: \n");
            	for(MenuOptions menu: MenuOptions.values()) {
            		System.out.printf("%-100s\n", menu.RoomInfo());
            	} 
            	System.out.printf("\n");
            	System.out.println("Hotel Name: ");
                String hotelName = sc.next();
                System.out.println("Room Type: ");
                String roomType = sc.next();
                System.out.println("Reservation Month: ");
                String reservationMonth = sc.next();
                System.out.println("Reservation Start: ");
                int reservationStart = sc.nextInt();
                System.out.println("Reservation End: ");
                int reservationEnd = sc.nextInt();
                room[id-1] = new Room(roomType);
                reserv[id-1] = new Reservation(reservationEnd, reservationStart, reservationMonth, hotelName,room[id-1]);
                System.out.printf("Reservation created!\n");
                System.out.printf("\n");
                Reservation.totalNumofReservations++;
                id++;
            }
            
            else if (choice==3) {

                for(int i=0; i<id-1; i++) {
                    System.out.println(reserv[i].displayInfo());
                    System.out.printf("\n");
                }
            }
            else if (choice==4) {
                
            	System.out.println(Reservation.totalNumofReservations + " rooms created so far.\n");
            }
            else if (choice==0) {
                break;
            }
            else {
                System.out.println("Wrong choice!");
            }
        }

        sc.close();


    }

}
