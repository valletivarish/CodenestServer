package com.buyzaar.myapp.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "suggested_projects")
public class SuggestedProject {
	@Id
	private String id;
	private Long userId;
	private List<String> projectIds;
	private LocalDateTime generatedAt;

	public SuggestedProject(String id, Long userId, List<String> projectIds, LocalDateTime generatedAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.projectIds = projectIds;
		this.generatedAt = generatedAt;
	}

	public SuggestedProject() {
		super();
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

	public List<String> getProjectIds() {
		return projectIds;
	}

	public void setProjectIds(List<String> projectIds) {
		this.projectIds = projectIds;
	}

	public LocalDateTime getGeneratedAt() {
		return generatedAt;
	}

	public void setGeneratedAt(LocalDateTime generatedAt) {
		this.generatedAt = generatedAt;
	}

	@Override
	public String toString() {
		return "SuggestedProject [id=" + id + ", userId=" + userId + ", projectIds=" + projectIds + ", generatedAt="
				+ generatedAt + "]";
	}

}