package OOPS;

import java.util.*;

class Airplane {
	String flightNumber;
	String destination;
	int scheduledDeparture;
	
	public Airplane(String flightNumber, String destination, int scheduledDeparture) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.scheduledDeparture = scheduledDeparture;
    }

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getDestination() {
		return destination;
	}
	
	public int getScheduledDeparture() {
		return scheduledDeparture;
	}
	public void status() {
		System.out.println("The flight number " + flightNumber + " to " + destination + " is scheduled for departure at " + scheduledDeparture + " hours");
	}
	public String status1() {
		return("The flight number " + flightNumber + " to " + destination);
	}
	
}

class checkStatus {
	String delayTime;
	int delay;
	public checkStatus(String ans, int delay) {		
		this.delayTime = ans;
		this.delay = delay;
	}
	public String time() {		
		if (delayTime.equals("NO") && delay == 0) {
			return(" is scheduled to depart on time.");
		}
		else {			
			return(" is delayed by " + delay + " hours.");
		}
	}
}

public class airplaneTicket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of journies: ");
		int n = sc.nextInt();
		int i;
		Airplane flight[] = new Airplane[n];
		for(i = 0; i < n; i++) {
			System.out.println("Enter the flight number: ");
			String flightnumber = sc.next();
			System.out.println("Enter the destination: ");
			String des = sc.next();
			System.out.println("Enter the time: ");
			int time = sc.nextInt();
			flight[i] = new Airplane(flightnumber, des, time);
		}
		System.out.println("Flight Status:");
		for(i = 0; i < n; i++) {
			flight[i].status();
		}
		System.out.println("\n");
		checkStatus delay[] = new checkStatus[n];
		for(i = 0; i < n; i++) {
			System.out.println("Is there any delay in the journey: ");
			String d = sc.next();
			int time = 0;
			if(d.equals("YES")) {
				System.out.println("If yes, enter the hours: ");
				time = sc.nextInt();
			}
			delay[i] = new checkStatus(d, time);
		}
		System.out.println("Current Flight Status: ");
		for(i = 0; i < n; i++) {
			String str1 = flight[i].status1(); 
			String str2 = delay[i].time();
			System.out.println(str1 + str2);
		}
	}
}
