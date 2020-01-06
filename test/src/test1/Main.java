package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}
		ArrayList<Student> stu=new ArrayList<Student>();
		for (int i = 0; i < n; i++) {
			 String[] s= str[i].split(" ");
	            Student st = new Student(Integer.parseInt(s[0]),s[1],Integer.parseInt(s[2]));
	            stu.add(st);
		}
		System.out.println(stu.toString());
	}
}