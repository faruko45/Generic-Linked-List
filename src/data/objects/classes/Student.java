package data.objects.classes;

import data.objects.interfaces.IPerson;

public class Student extends Object implements IPerson, Comparable<Student> {
	String name;
	int age;
	String id;
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	public Student(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void printInfos() {
		System.out.println(Student.class.getSimpleName() + " " + name + " " + age + " " + id);
	}

	public int compareTo(Student o) {
		return this.id.compareTo(o.getId());
	}

}
