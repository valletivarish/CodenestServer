package com.buyzaar.myapp.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coupons")
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String description;
	private double discountPercentage;
	private boolean isStackable;
	private boolean isInviteOnly;
	private boolean isActive;
	private LocalDateTime validTill;

	public Coupon() {
	}

	public Coupon(String code, String description, double discountPercentage, boolean isStackable, boolean isInviteOnly,
			boolean isActive, LocalDateTime validTill) {
		this.code = code;
		this.description = description;
		this.discountPercentage = discountPercentage;
		this.isStackable = isStackable;
		this.isInviteOnly = isInviteOnly;
		this.isActive = isActive;
		this.validTill = validTill;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public boolean isStackable() {
		return isStackable;
	}

	public void setStackable(boolean isStackable) {
		this.isStackable = isStackable;
	}

	public boolean isInviteOnly() {
		return isInviteOnly;
	}

	public void setInviteOnly(boolean isInviteOnly) {
		this.isInviteOnly = isInviteOnly;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDateTime getValidTill() {
		return validTill;
	}

	public void setValidTill(LocalDateTime validTill) {
		this.validTill = validTill;
	}

}
