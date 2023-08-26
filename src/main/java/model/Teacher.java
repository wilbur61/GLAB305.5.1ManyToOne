package model;
import jakarta.persistence.*;
import model.Department;

import java.io.Serializable;

@Entity
@Table
public class Teacher implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY )
	private int tit;
	private String salary;
	private String Teachername;

	//Let us consider an example of a relationship between Teacher and a 
	//department entity. A Department consists of multiple Teachers, but 
	//each Teacher belongs to only one Department. That is a typical example 
	//for a many-to-one relationship or association. We will model this in a 
	//database that we need to store the primary key of the Department record 
	//in as a foreign key in the Teacher table.
	//
	//
	
	@ManyToOne
	private Department department;
	public Teacher(int tit, String salary, String teachername) {
		super();
		this.tit = tit;
		this.salary = salary;
		Teachername = teachername;
	}
	public Teacher()
	{}
	
	public Department getDep() {
		return department;
	}
	public void setDep(Department department) {
		this.department = department;
	}
	public int getTit() {
		return tit;
	}
	public void setTit(int tit) {
		this.tit = tit;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getTeachername() {
		return Teachername;
	}
	public void setTeachername(String teachername) {
		Teachername = teachername;
	}	
}