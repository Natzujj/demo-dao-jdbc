package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;



public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

		
//		System.out.println("\n=== TEST 3: Department Insert ===");
//		Department newDepartment = new Department(null, "Games");
//		departmentDao.insert(newDepartment);
//		System.out.println("Inserted! New id= " + newDepartment.getId());
		
		
		System.out.println("\n=== TEST 4: Department Update ===");
		Department department2 = departmentDao.findById(6);
		department2.setName("Music");
		departmentDao.update(department2);
		System.out.println("Update Completed " + department2);
		
		
		System.out.println("\n=== TEST 5: Department Delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed!");
		List<Department> list2 = departmentDao.findAll();
		for(Department obj : list2) {
			System.out.println(obj);
		}
		
		sc.close();
		
		
	}

}
