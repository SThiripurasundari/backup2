import java.util.*;

import Practise.Student;

public class NameComparator {
	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();
		Student st01 = new Student(101, "Vijay", 35);
		Student st02 = new Student(131, "VJ", 24);
		Student st03 = new Student(151, "AJ", 39);
		Student st04 = new Student(111, "Na", 28);
		al.add(st01);
		al.add(st02);
		al.add(st03);
		al.add(st04);
		
		Comparator.comparing((Student stu)  -> stu.getName());
		
		Collections.sort(al, Comparator.comparing((Student student) -> student.getAge()));
		al.stream().forEach(student -> System.out.println(student.getAge()));
		// OPTION 2 :Lambda
		Collections.sort(al, Comparator.comparing((Student student) -> student.getName()));
		al.stream().forEach(student -> System.out.println(student.getName()));

		// Option 1
		Comparator<Student> SORT_NAME = new Comparator<Student>() {
			public int compare(Student e1, Student e2) {
				return e2.getName().compareTo(e1.getName());
			}
		};
		Collections.sort(al, SORT_NAME);
		al.stream().forEach(student -> System.out.println(student.getName()));

		for (Student st : al) {
			System.out.println("st-->" + st.getName());
		}

		/*
		 * Comparator<Student> cm1 = Comparator.comparing(Student::getName,
		 * Comparator.nullsFirst(String::compareTo)); Collections.sort(al, cm1);
		 * System.out.println("Considers null to be less than non-null"); for (Student
		 * st : al) { System.out.println(st.getId() + " " + st.getName() + " " +
		 * st.getAge()); }
		 * 
		 * Comparator<Student> cm2 = Comparator.comparing(Student::getName,
		 * Comparator.nullsLast(String::compareTo)); Collections.sort(al, cm2);
		 * System.out.println("Considers null to be greater than non-null"); for
		 * (Student st : al) { System.out.println(st.getId() + " " + st.getName() + " "
		 * + st.getAge()); }
		 */

	}
}