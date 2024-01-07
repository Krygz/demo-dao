package application;


import java.sql.Date;
import java.util.List;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {
	public static void main(String[] args) {
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	
	System.out.println("Test 1:");
	
    Seller seller = sellerDao.findById(1);
    
    System.out.print(seller);
    
    System.out.println("\nTest 2:");
    
    Department department = new Department(2, null);
    
    List<Seller>list = sellerDao.findByDepartment(department);
    
    for(Seller i : list) {
    	System.out.println(i);
    }
    
    
    
    
	}
}
