/***************
 * Vehicle: A constructor is created and sent to control.java with the details
 */
package com.lab1.test;

public class Vehicle {
	private String owner_name;
	private String reg_num;
	private int max_speed;
	private String transmission;
	private int wheel_no;
	
	public Vehicle(String owner_name,String reg_num,int max_speed,String transmission, int wheel_no){
		this.owner_name=owner_name.toUpperCase();
		this.reg_num=reg_num.toUpperCase();
		this.max_speed = max_speed;
		this.transmission = transmission.toUpperCase();
		this.wheel_no = wheel_no;
	
	}
	
	public Vehicle(String owner_name,String reg_num) {
		this.owner_name="Sultan";
		this.reg_num="12-MH-1245";
	}
	
	public String toString() {
		return "Name is "+owner_name+" reg is "+reg_num+" max speed is "+max_speed+
				" transmission is "+transmission+ " and the number of wheels is "+wheel_no;
	}
	

}
