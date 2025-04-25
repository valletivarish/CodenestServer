package com.buyzaar.myapp.entity;

public class Rating {
	private double averageRating;
	private int totalRatings;

	public Rating() {
	}

	public Rating(double averageRating, int totalRatings) {
		this.averageRating = averageRating;
		this.totalRatings = totalRatings;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	public int getTotalRatings() {
		return totalRatings;
	}

	public void setTotalRatings(int totalRatings) {
		this.totalRatings = totalRatings;
	}

	@Override
	public String toString() {
		return "Rating [averageRating=" + averageRating + ", totalRatings=" + totalRatings + "]";
	}

}