package com.buyzaar.myapp.entity;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "project_user_activities")
public class ProjectUserActivity {
	@Id
	private String id;
	private Long userId;
	private String projectId;
	private GitHubInfo githubInfo;
	private boolean zipDownloaded;
	private int zipDownloadCount;
	private LocalDateTime lastZipDownloadTime;

	public ProjectUserActivity() {
		super();
	}

	public ProjectUserActivity(String id, Long userId, String projectId, GitHubInfo githubInfo, boolean zipDownloaded,
			int zipDownloadCount, LocalDateTime lastZipDownloadTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.projectId = projectId;
		this.githubInfo = githubInfo;
		this.zipDownloaded = zipDownloaded;
		this.zipDownloadCount = zipDownloadCount;
		this.lastZipDownloadTime = lastZipDownloadTime;
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

	public GitHubInfo getGithubInfo() {
		return githubInfo;
	}

	public void setGithubInfo(GitHubInfo githubInfo) {
		this.githubInfo = githubInfo;
	}

	public boolean isZipDownloaded() {
		return zipDownloaded;
	}

	public void setZipDownloaded(boolean zipDownloaded) {
		this.zipDownloaded = zipDownloaded;
	}

	public int getZipDownloadCount() {
		return zipDownloadCount;
	}

	public void setZipDownloadCount(int zipDownloadCount) {
		this.zipDownloadCount = zipDownloadCount;
	}

	public LocalDateTime getLastZipDownloadTime() {
		return lastZipDownloadTime;
	}

	public void setLastZipDownloadTime(LocalDateTime lastZipDownloadTime) {
		this.lastZipDownloadTime = lastZipDownloadTime;
	}

	@Override
	public String toString() {
		return "ProjectUserActivity [id=" + id + ", userId=" + userId + ", projectId=" + projectId + ", zipDownloaded="
				+ zipDownloaded + ", zipDownloadCount=" + zipDownloadCount + ", lastZipDownloadTime="
				+ lastZipDownloadTime + "]";
	}

}