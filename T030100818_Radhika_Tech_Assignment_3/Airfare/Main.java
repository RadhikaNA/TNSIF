package Airfare;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice = scanner.nextInt();
	        int hours = scanner.nextInt();
	        double costPerHour = scanner.nextDouble();

	        Airfare airfare;
	        
	        switch (choice) {
	            case 1:
	                airfare = new AirIndia(hours, costPerHour);
	                break;
	            case 2:
	                airfare = new KingFisher(hours, costPerHour);
	                break;
	            case 3:
	                airfare = new Indigo(hours, costPerHour);
	                break;
	            default:
	                System.out.println("Invalid choice");
	                scanner.close();
	                return;
	        }
	        
	        System.out.printf("%.2f\n", airfare.calculateAmount());
	        scanner.close();
	    }
	}
	
