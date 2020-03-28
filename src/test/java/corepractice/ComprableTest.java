package corepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	
	int id;
	String name;
	
	public Student(int id,String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "(id=" + id + ", name=" + name + ")";
	}

	@Override
	public int compareTo(Student o) {
		return o.id - this.id;
	}
	
}
public class ComprableTest {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1, "B"));
		studentList.add(new Student(2, "A"));
		studentList.add(new Student(4, "C"));
		studentList.add(new Student(3, "E"));
		
		System.out.println(studentList);
		
		System.out.println("	After Sorting");
		
		Collections.sort(studentList);
				
		System.out.println(studentList);
	}
}

