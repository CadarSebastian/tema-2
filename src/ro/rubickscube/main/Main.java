package ro.rubickscube.main;


import java.sql.SQLException;
import java.util.ArrayList;

import ro.emanuel.dao.StudentDAO;
import ro.emanuel.helpers.DBHelper;
import ro.emanuel.pojo.Student;


public class Main {


	public static void main(String[] args) throws SQLException {

//		ArrayList<Student> studenti = StudentDAO.getAll();
//		for (Student s : studenti) {
//			System.out.println(s.getId() + " " + s.getNume());
//		}
//		
//		Student s1 = StudentDAO.getById(2);
//		
//		if(s1 != null) {
//			System.out.println("Studentul cu id =1 are numele " + s1.getNume());
//		}else {
//			System.out.println("NU exista student cu id 1.");
//		}
//		
////		s1.setId(2);
//		s1.setNume("Mircea");
//		
//		boolean actualizat = StudentDAO.update(s1);
//		if (actualizat == true) {
//			System.out.println("Studentul a fost actualizat");
//		}else {
//			System.out.println("Studentul nu a fost gasit in db");
//		}
//		
//		System.out.println(StudentDAO.delete("Nae"));
		
		
//		----
//		Student mario = new Student("Mario", "123345", 678);
//		
//		for(int i =1; i<= 1000; i++) {
//			StudentDAO.create(mario);
//		}
//		
		
		//System.out.println(StudentDAO.delete("Mario"));
;		//DBHelper.closeConnection();
	}

}