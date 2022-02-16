/*
* File: App.java
* Author: Székely Márton
* Copyright: 2021, Székely Márton
* Group: Szoft I/N
* Date: 2022-02-16
* Github: https://github.com/Lijakudo/
* Licenc: GNU GPL
*/
import java.util.Scanner;

class App{
	public static void main(String[] args) {
				
		System.out.println("Szekely Márton, 2022-02-16, SZOFT I/N");
		System.out.println("Feladat: 0306");
		System.out.println("Haromszog terulete");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Oldal: ");
		double oldal = scan.nextDouble();
		
		System.out.print("Magassag: ");
		double magassag = scan.nextDouble();
		
		double terulet = (oldal*magassag)/2;
		System.out.println("Terulet :" + terulet);
		}
	}
