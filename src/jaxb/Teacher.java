package jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="teacher")
@XmlAccessorType(XmlAccessType.NONE)
public class Teacher {
	@XmlElementWrapper(name="students")
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		List<Student> list = new ArrayList<>();
		Student s1 = new Student("yang","zzzz");
		list.add(s1);
		list.add(s1);
		t.setStudents(list);
		System.out.println(JaxbUtil.convertToXml(t));
	}
}


/**
 * @author yangzhec
 *
 */

@XmlAccessorType(XmlAccessType.NONE)
class Student{
	@XmlAttribute
	private String name;
	@XmlAttribute
	private String info;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public Student(){}
	public Student(String name,String info){
		this.name =  name;
		this.info = info;
	}
}