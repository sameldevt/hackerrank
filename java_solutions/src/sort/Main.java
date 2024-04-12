package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Student o) {
		if (this.cgpa > o.getCgpa()) {
			return -1;
		} else if (this.cgpa < o.getCgpa()) {
			return 1;
		} else if (this.cgpa == o.getCgpa()) {
			if (this.fname.compareTo(o.getFname()) > 0) {
				return 1;
			} else if (this.fname.compareTo(o.getFname()) < 0) {
				return -1;
			} else if (this.fname.compareTo(o.getFname()) == 0) {
				return 0;
			} else {
				if (this.id > o.id) {
					return 1;
				} else if (this.id < o.id) {
					return -1;
				}
			}
		}
		return 0;
	}
}

//Complete the code
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Comparator<Student> comparator = (s1, s2) -> s1.compareTo(s2);

		Collections.sort(studentList, comparator);

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}