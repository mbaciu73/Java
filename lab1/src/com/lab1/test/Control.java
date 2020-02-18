/********************
 * Control: The purpose is to print hello world while also trying
 */
package com.lab1.test;

public class Control {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Jane Ferris","12-D-19234",120,"Automatic",4);
		Vehicle v2 = new Vehicle("Enoch Duadu","69-666-911",420,"Manual",3);
		Vehicle v3 = new Vehicle("Sultan Reidy","420-D-911");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
