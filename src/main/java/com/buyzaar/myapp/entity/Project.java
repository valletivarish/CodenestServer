package com.buyzaar.myapp.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale.Category;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "projects")
public class Project {
	@Id
	private String id;
	private Long authorUserId;
	private String title;
	private String description;
	private String techStack;
	private double price;
	private boolean isPublished;
	private String githubUrl;
	private String zipUrl;
	private Discount discount;
	private Category category;
	private Set<String> tags;
	private Set<String> skillsUsed;
	private LocalDateTime createdAt;
	private List<Review> reviews;
	private Rating rating;

	public Project(String id, Long authorUserId, String title, String description, String techStack, double price,
			boolean isPublished, String githubUrl, String zipUrl, Discount discount, Category category,
			Set<String> tags, Set<String> skillsUsed, LocalDateTime createdAt, List<Review> reviews, Rating rating) {
		this.id = id;
		this.authorUserId = authorUserId;
		this.title = title;
		this.description = description;
		this.techStack = techStack;
		this.price = price;
		this.isPublished = isPublished;
		this.githubUrl = githubUrl;
		this.zipUrl = zipUrl;
		this.discount = discount;
		this.category = category;
		this.tags = tags;
		this.skillsUsed = skillsUsed;
		this.createdAt = createdAt;
		this.reviews = reviews;
		this.rating = rating;
	}

	public Project() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getAuthorUserId() {
		return authorUserId;
	}

	public void setAuthorUserId(Long authorUserId) {
		this.authorUserId = authorUserId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTechStack() {
		return techStack;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isPublished() {
		return isPublished;
	}

	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}

	public String getGithubUrl() {
		return githubUrl;
	}

	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}

	public String getZipUrl() {
		return zipUrl;
	}

	public void setZipUrl(String zipUrl) {
		this.zipUrl = zipUrl;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

	public Set<String> getSkillsUsed() {
		return skillsUsed;
	}

	public void setSkillsUsed(Set<String> skillsUsed) {
		this.skillsUsed = skillsUsed;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", authorUserId=" + authorUserId + ", title=" + title + ", description="
				+ description + ", techStack=" + techStack + ", price=" + price + ", isPublished=" + isPublished
				+ ", githubUrl=" + githubUrl + ", zipUrl=" + zipUrl + ", category=" + category + ", tags=" + tags
				+ ", skillsUsed=" + skillsUsed + ", createdAt=" + createdAt + "]";
	}

}