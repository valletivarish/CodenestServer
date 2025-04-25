package com.buyzaar.myapp.entity;

import java.time.LocalDateTime;

public class Discount {
	private double percentage;
	private String description;
	private boolean active;
	private LocalDateTime validTill;

	public Discount(double percentage, String description, boolean active, LocalDateTime validTill) {
		this.percentage = percentage;
		this.description = description;
		this.active = active;
		this.validTill = validTill;
	}

	public Discount() {
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDateTime getValidTill() {
		return validTill;
	}

	public void setValidTill(LocalDateTime validTill) {
		this.validTill = validTill;
	}

	@Override
	public String toString() {
		return "Discount [percentage=" + percentage + ", description=" + description + ", active=" + active
				+ ", validTill=" + validTill + "]";
	}

}
