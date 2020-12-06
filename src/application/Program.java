package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Michael", "scott@dundlermifflin.com", new Date(), 4269.0, obj);
		System.out.println(seller);	
	}
}
