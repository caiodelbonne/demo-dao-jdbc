package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
//		Department obj = new Department(1, "Books");
//		Seller seller = new Seller(20, "Bob", "bob@bob", new Date(), 3000.0, obj);
		SellerDao sellerDao = DaoFactory.createSellerDao(); // programa so conhece o interface 
		System.out.println("=== Test 1 : Seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	}

}
