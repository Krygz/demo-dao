package application;


import java.sql.Date;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {
	public static void main(String[] args) {
	
	Department department = new Department(2 , "Jhon");

	Seller seller = new Seller(21 , "bob" , "bob@gmail.com" ,new Date(0),  3000.00 , department);
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	System.out.print(seller);
	
	}
}
