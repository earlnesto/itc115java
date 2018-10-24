
import java.util.Scanner;

public class Seasons{
	
public static void main(String[] args){
	  
	Scanner keyboard = new Scanner(System.in);

	System.out.println("This program reports the season for a given day and month");
	System.out.print("Please enter the month as integer: ");
	int month = keyboard.nextInt();
	
	System.out.print("Please enter the day as integer: ");
	int day = keyboard.nextInt();
	
//	if (month < 1 || month > 12) {
//		System.out.println("Please enter a month between 1 and 12");
//	} else if (day < 1 || day > 31) {
//		System.out.println("Pease enter a day between 1 and 31");
//	}
	
	if (month == 1 || month == 2) {
		System.out.println("It's Winter!");
	} else if (month == 3) {
		if (day <= 15) {
			System.out.println("It's Winter!");
		} else {
			System.out.println("It's Spring!");
		}
		
	} else if (month == 4 || month == 5) {
		System.out.println("It's Spring!");
	} else if (month == 6) {
		if (day <= 15) {
			System.out.println("It's Spring!");
		} else {
			System.out.println("It's Summer!");
		}
	} else if (month == 7 || month == 8) {
		System.out.println("It's Summer!");
	} else if (month == 9) {
		if (day <= 15) {
			System.out.println("It's Summer!");
		} else {
			System.out.println("It's Fall!");
		}
	} else if (month == 10 || month == 11) {
		System.out.println("It's Fall!");
	} else if (month == 12) {
		if (day <= 15) {
			System.out.println("It's Fall!");
		} else {
			System.out.println("It's Winter!");
		}
	}

 }

}