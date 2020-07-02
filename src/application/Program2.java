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
	}

}
