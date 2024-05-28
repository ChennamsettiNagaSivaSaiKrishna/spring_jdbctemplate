package mvc.model;

public class Student {
	int roll;
	String name;
	float Marks;
	String section;
	String Dept;
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getMarks() {
		return Marks;
	}
	public void setMarks(Float marks) {
		Marks = marks;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
}
