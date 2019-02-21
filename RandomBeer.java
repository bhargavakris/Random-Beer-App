package com.DistilledSCH.Random_Beer_App.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class RandomBeer {
	
	@Id
	@GeneratedValue()
	private int id;
	
	private String beer_name;
	
	@Size(min=10,message="Enter atleast 10 characters")
	private String description;
	
	private float alcohol_percent;
	
	private String brewery_location;
	
	
	public RandomBeer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RandomBeer(int id, String beer_name, @Size(min = 10, message = "Enter atleast 10 characters") String description,
			float alcohol_percent, String brewery_location) {
		super();
		this.id = id;
		this.beer_name = beer_name;
		this.description = description;
		this.alcohol_percent = alcohol_percent;
		this.brewery_location = brewery_location;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBeer_name() {
		return beer_name;
	}
	public void setBeer_name(String beer_name) {
		this.beer_name = beer_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAlcohol_percent() {
		return alcohol_percent;
	}
	public void setAlcohol_percent(float alcohol_percent) {
		this.alcohol_percent = alcohol_percent;
	}
	public String getBrewery_location() {
		return brewery_location;
	}
	public void setBrewery_location(String brewery_location) {
		this.brewery_location = brewery_location;
	}

	@Override
	public String toString() {
		return "RandomBeer [id=" + id + ", beer_name=" + beer_name + ", description=" + description + ", alcohol_percent="
				+ alcohol_percent + ", brewery_location=" + brewery_location + "]";
	}
	
	
}
