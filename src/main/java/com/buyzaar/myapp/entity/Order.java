package com.buyzaar.myapp.entity;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.index.Indexed;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Indexed(unique = true)
	private Long userId;
	private String projectId;
	private LocalDateTime purchasedAt;
	private double price;
	private boolean isZipDownloaded;
	private boolean isGithubPushed;

	public Order() {
	}

	public Order(Long id, Long userId, String projectId, LocalDateTime purchasedAt, double price,
			boolean isZipDownloaded, boolean isGithubPushed) {
		this.id = id;
		this.userId = userId;
		this.projectId = projectId;
		this.purchasedAt = purchasedAt;
		this.price = price;
		this.isZipDownloaded = isZipDownloaded;
		this.isGithubPushed = isGithubPushed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public LocalDateTime getPurchasedAt() {
		return purchasedAt;
	}

	public void setPurchasedAt(LocalDateTime purchasedAt) {
		this.purchasedAt = purchasedAt;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isZipDownloaded() {
		return isZipDownloaded;
	}

	public void setZipDownloaded(boolean isZipDownloaded) {
		this.isZipDownloaded = isZipDownloaded;
	}

	public boolean isGithubPushed() {
		return isGithubPushed;
	}

	public void setGithubPushed(boolean isGithubPushed) {
		this.isGithubPushed = isGithubPushed;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", projectId=" + projectId + ", purchasedAt=" + purchasedAt
				+ ", price=" + price + ", isZipDownloaded=" + isZipDownloaded + ", isGithubPushed=" + isGithubPushed
				+ "]";
	}

}
