package com.bishram.jharkhand.tour.model;

public class ItemModel {
    /** String resource ID for the distance text of the location. */
    private String mDistanceText = DIST_TEXT_NOT_FOUND;

    /** String resource ID for the name of the location. */
    private String mImageName;

    /** Image resource ID for the location or attraction. */
    private int mImageResource;

    /** Rating resource ID for the points of the location. */
    private double mStarsPoint;

    /** Review resource ID for the no. of review of the location. */
    private int mReviewsPoint;

    /** A CONSTANT value that represents that no distance text is found. */
    private static final String DIST_TEXT_NOT_FOUND = "";

    public ItemModel(String imageName, double starsPoint, int reviewsPoint, String distanceText, int imageResource) {
        mImageName = imageName;
        mStarsPoint = starsPoint;
        mReviewsPoint = reviewsPoint;
        mDistanceText = distanceText;
        mImageResource = imageResource;
    }

    public ItemModel(String imageName, double starsPoint, int reviewsPoint, int imageResource) {
        mImageName = imageName;
        mStarsPoint = starsPoint;
        mReviewsPoint = reviewsPoint;
        mImageResource = imageResource;
    }

    public String getImageName() {
        return mImageName;
    }

    public double getStarsPoint() {
        return mStarsPoint;
    }

    public int getReviewsPoint() {
        return mReviewsPoint;
    }

    public boolean hasDistanceText() {
        return !mDistanceText.equals(DIST_TEXT_NOT_FOUND);
    }
    public String getDistanceText() {
        return mDistanceText;
    }

    public int getImageResource() {
        return mImageResource;
    }
}
