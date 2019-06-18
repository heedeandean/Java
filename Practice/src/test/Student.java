package test;

public class Student {
	String id;
	String name;
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(id);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			if(this.id == stu.id)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return id + ":" + name;
	}
	
	
}
