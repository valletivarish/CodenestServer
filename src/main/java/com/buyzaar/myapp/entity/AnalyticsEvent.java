package com.buyzaar.myapp.entity;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "analytics_events")
public class AnalyticsEvent {
	@Id
	private String id;
	private Long userId;
	private String eventType;
	private String projectId;
	private LocalDateTime timestamp;

	public AnalyticsEvent(String id, Long userId, String eventType, String projectId, LocalDateTime timestamp) {
		super();
		this.id = id;
		this.userId = userId;
		this.eventType = eventType;
		this.projectId = projectId;
		this.timestamp = timestamp;
	}

	public AnalyticsEvent() {
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

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "AnalyticsEvent [id=" + id + ", userId=" + userId + ", eventType=" + eventType + ", projectId="
				+ projectId + ", timestamp=" + timestamp + "]";
	}

}
