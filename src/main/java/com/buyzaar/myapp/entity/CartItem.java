package com.buyzaar.myapp.entity;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "cart_items")
public class CartItem {
	@Id
	private String id;
	@Indexed(unique = true)
	private Long userId;
	private String projectId;
	private LocalDateTime addedAt;

	public CartItem(String id, Long userId, String projectId, LocalDateTime addedAt) {
		this.id = id;
		this.userId = userId;
		this.projectId = projectId;
		this.addedAt = addedAt;
	}

	public CartItem() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public LocalDateTime getAddedAt() {
		return addedAt;
	}

	public void setAddedAt(LocalDateTime addedAt) {
		this.addedAt = addedAt;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", userId=" + userId + ", projectId=" + projectId + ", addedAt=" + addedAt + "]";
	}

}