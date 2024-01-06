package application;


import java.sql.Date;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {
	public static void main(String[] args) {
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
    Seller seller = sellerDao.findById(1);
    
    System.out.print(seller);
	}
}
