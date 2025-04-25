package com.buyzaar.myapp.entity;

import java.time.LocalDateTime;

public class Review {
	private Long userId;
	private String comment;
	private int ratingValue;
	private LocalDateTime reviewedAt;

	public Review(Long userId, String comment, int ratingValue, LocalDateTime reviewedAt) {
		this.userId = userId;
		this.comment = comment;
		this.ratingValue = ratingValue;
		this.reviewedAt = reviewedAt;
	}

	public Review() {
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRatingValue() {
		return ratingValue;
	}

	public void setRatingValue(int ratingValue) {
		this.ratingValue = ratingValue;
	}

	public LocalDateTime getReviewedAt() {
		return reviewedAt;
	}

	public void setReviewedAt(LocalDateTime reviewedAt) {
		this.reviewedAt = reviewedAt;
	}

	@Override
	public String toString() {
		return "Review [userId=" + userId + ", comment=" + comment + ", ratingValue=" + ratingValue + ", reviewedAt="
				+ reviewedAt + "]";
	}

}
