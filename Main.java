package java01;
import java.util.Scanner;


public class Main{
	

	
	public static void main(String[] args) {
		
		String[][] cars = {{"Mustang","BMW","Testla"},{"Camaro","Ranger","Silverdo"},{"F-150","Lambo","corvette"}};
		
		for (int i=0; i<cars.length; i++) {
			System.out.println();
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+ "  ");
				}
			
		}
		
		
	}
		
     		
	
}