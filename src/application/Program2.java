package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println(" === Testando FindBy Id department ===");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
	
		System.out.println(" === Testando insert ===");
		Department novodepartment = new Department(null, "Banheiro");
		departmentDao.insert(novodepartment);
		System.out.println("Departamento inserido Id = " + novodepartment.getId() + 
							"nome do departamento " + novodepartment.getName());
	//		
		System.out.println("= = = Update Test = = = ");
		Department depUP = departmentDao.findById(7); 
		depUP.setName("Game");
		departmentDao.update(depUP);
		System.out.println("Departamento alterado com sucesso " + depUP.getName());
	
	}

}
