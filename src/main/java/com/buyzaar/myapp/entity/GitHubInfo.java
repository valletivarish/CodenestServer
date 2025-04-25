package com.buyzaar.myapp.entity;

import java.time.LocalDateTime;

public class GitHubInfo {
	private Long userId;
	private String githubUsername;
	private String githubEmail;
	private boolean isProjectPushedToGitHub;
	private LocalDateTime githubPushTime;

	public GitHubInfo() {
	}

	public GitHubInfo(Long userId, String githubUsername, String githubEmail, boolean isProjectPushedToGitHub,
			LocalDateTime githubPushTime) {
		this.userId = userId;
		this.githubUsername = githubUsername;
		this.githubEmail = githubEmail;
		this.isProjectPushedToGitHub = isProjectPushedToGitHub;
		this.githubPushTime = githubPushTime;
	}

	public String getGithubUsername() {
		return githubUsername;
	}

	public void setGithubUsername(String githubUsername) {
		this.githubUsername = githubUsername;
	}

	public String getGithubEmail() {
		return githubEmail;
	}

	public void setGithubEmail(String githubEmail) {
		this.githubEmail = githubEmail;
	}

	public boolean isProjectPushedToGitHub() {
		return isProjectPushedToGitHub;
	}

	public void setProjectPushedToGitHub(boolean isProjectPushedToGitHub) {
		this.isProjectPushedToGitHub = isProjectPushedToGitHub;
	}

	public LocalDateTime getGithubPushTime() {
		return githubPushTime;
	}

	public void setGithubPushTime(LocalDateTime githubPushTime) {
		this.githubPushTime = githubPushTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "GitHubInfo [githubUsername=" + githubUsername + ", githubEmail=" + githubEmail
				+ ", isProjectPushedToGitHub=" + isProjectPushedToGitHub + ", githubPushTime=" + githubPushTime + "]";
	}

}