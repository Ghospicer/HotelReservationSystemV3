import java.util.Scanner;
import java.util.EnumSet;


public class HotelReservationSystem {

    public static void main(String[] args) {
        Reservation[] reserv = new Reservation[50];
        Room[] room = new Room[50];
        int id = 1;
        int choice;
        Scanner sc = new Scanner(System.in);

        while(true) {       		
        	
        	for(MenuOptions rm: EnumSet.range(MenuOptions.FIRST, MenuOptions.EXIT)) {
        		System.out.printf("%-100s\n", rm.menuOptions());
        		System.out.printf("\n");
        	}        	

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
            	for(MenuOptions rm: EnumSet.range(MenuOptions.SINGLE, MenuOptions.SUITE)) {
            		System.out.printf("%-100s\n", rm.menuOptions());
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
            else if (choice==5) {
                break;
            }
            else {
                System.out.println("Wrong choice!");
            }
        
        
        }

        sc.close();
    }

}
