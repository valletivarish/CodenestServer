package com.buyzaar.myapp.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "categories")
public class Category {
	@Id
	private String id;
	private String name;
	private boolean active;

	public Category(String id, String name, boolean active) {
		this.id = id;
		this.name = name;
		this.active = active;
	}

	public Category() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", active=" + active + "]";
	}

}
