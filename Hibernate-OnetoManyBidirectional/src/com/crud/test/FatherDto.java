package com.crud.test;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_father")
public class FatherDto implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String name;
	private double salary;
	
	@OneToMany(mappedBy="father") // it will not create F.K for this Table
	List<SonDto> sons;                          

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<SonDto> getSons() {
		return sons;
	}

	public void setSons(List<SonDto> sons) {
		this.sons = sons;
	}
    
	// Remove sons to avoid recurrsion
	@Override
	public String toString() {
		return "FatherDto [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
	
	
}
