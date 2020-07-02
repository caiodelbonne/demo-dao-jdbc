package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(" === Testando FindBy Id department ===");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
	
		System.out.println(" = = = Testando Find ALL = = = ");
		List<Department> list = departmentDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		
//		System.out.println(" === Testando insert ===");
//		Department novodepartment = new Department(null, "Banheiro");
//		departmentDao.insert(novodepartment);
//		System.out.println("Departamento inserido Id = " + novodepartment.getId() + 
//							"nome do departamento " + novodepartment.getName());
//	//		
		System.out.println("= = = Update Test = = = ");
		Department depUP = departmentDao.findById(7); 
		depUP.setName("Game");
		departmentDao.update(depUP);
		System.out.println("Departamento alterado com sucesso " + depUP.getName());
	
		System.out.println("= = =  Delete Test = = = ");
		System.out.print("entre com o departamento para ser deletado ");
		int id= sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("\n Deletado !!!");
		
	
		sc.close();
	}

}
