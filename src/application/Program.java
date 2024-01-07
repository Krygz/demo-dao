package application;




import java.util.Date;
import java.util.List;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {
	public static void main(String[] args) {
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	
	System.out.println("FindById:");
	
    Seller seller = sellerDao.findById(1);
    
    System.out.print(seller);
    
    System.out.println("\nFindByDepartment:");
    
    Department department = new Department(2, null);
    
    List<Seller>list = sellerDao.findByDepartment(department);
    
    for(Seller i : list) {
    	System.out.println(i);
    }
    
    System.out.println("\nFindAll");
    
    list = sellerDao.findAll();
    
    for(Seller i : list) {
    	System.out.println(i);
    }
    
    System.out.println("\nSeller Insert");
    Seller newSeller = new Seller(null , "Greg" , "greg@gmail.com" , new Date() ,4000.00 ,department);
    sellerDao.insert(newSeller);
    System.out.println("Inserted! New id = "+newSeller.getId());
    
    
	}
}
