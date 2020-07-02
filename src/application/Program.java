package application;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Department obj = new Department(1, "Books");
//		Seller seller = new Seller(20, "Bob", "bob@bob", new Date(), 3000.0, obj);
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: seller find A L L  =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

//		System.out.println("\n=== TEST 4: seller insert  =====");
//		Seller newSeller = new Seller(null, "Cesar", "greg@email.com", new Date(), 4000.0, department); // usa o department estanciado anteriormente para setar o valor e departamento id
//		sellerDao.insert(newSeller);
//		System.out.println("Insert new id = "+ newSeller.getId());
	
		System.out.println("\n=== TEST 5: seller update =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha ");
		sellerDao.update(seller);
		System.out.println("Update completed");
		

		System.out.println("\n=== TEST 6: seller delete=====");
		System.out.println("Delete id ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("operação concluida ");
	}

}
