/*
*File: app.java
*Author: Szabó Brigi
*Copyright: 2022, Szabó Brigitta
*Group: Szoft I/N
*Date: 2022-02-22
*Github: github/tailorbrigit
*/



import java.util.Scanner;
public class atlagsebesseg{

	public static void main(String[] args){
	System.out.println("Szabo Brigitta, 2022-02-22, Szoft I/N");
	System.out.println("Feladat 0309");
	System.out.println("Atlagsebesseg");

	Scanner sc = new Scanner(System.in);
	System.out.println();

	System.out.print("Megtett ut: ");
	double ut = sc.nextDouble();

	System.out.print("Megtett ido: ");
	double ido = sc.nextDouble();

	double atlagsebesseg = ut + ido /2;
	System.out.print("Test atlagsebessege: : " + atlagsebesseg);

	


}
}