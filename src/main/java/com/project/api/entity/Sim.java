package com.project.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName="build")
public class Sim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    @NotBlank(message="username shouldn't be null")
	private String name;
	
    @NotBlank(message="Address shouldn't be null")
	private String Address;
	
    @NotNull(message="gender must enter")
	private String gender;
    
	@Min(21)
	@Max(60)
	private int age;
	
	@NotBlank(message="If you must be a nationality has provided here")
	private String nationality;
	
//	@Pattern(regexp="^\\d{10}$", message="Invalid mobile number you entered")
	@Min(10)
	private long number;

	public Sim() {
		super();	
	}

	public Sim(int id, String name, String address, String gender, int age, String nationality, long number) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
		this.number = number;
	}

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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

}
