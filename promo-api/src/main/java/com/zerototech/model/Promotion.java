package com.zerototech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Promotion {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
	private long Id;
	
	private String name;
	private String description;
	private String startDate;
	private String endDate;
	
	public Promotion() {
		
	}
	
	public Promotion(int Id ,String name ,String description ,String startDate ,String endDate) {
		super();
		this.Id=Id;
		this.name=name;
		this.description=description;
		this.startDate =startDate;
		this.endDate =endDate;
	}
	
	public long getId() {
		return Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
