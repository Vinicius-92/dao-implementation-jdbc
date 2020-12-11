package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
		
		System.out.println("==== TEST 1: department insert =====");
		Department newDepartment = new Department(null, "Foods");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted completed! Id number: " + newDepartment.getId());
		System.out.println();
		
		System.out.println("==== TEST 2: department delete =====");
		System.out.println("Enter id for delete test: ");
		int id = scanner.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		System.out.println();
		
		System.out.println("==== TEST 3: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("==== TEST 4: department findById =====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		System.out.println();
		
		System.out.println("==== TEST 5: department update =====");
		department = departmentDao.findById(1);
		department.setName("Foods");
		departmentDao.update(department);
		System.out.println("Update completed");
		System.out.println();
		
		scanner.close();
	}
}
