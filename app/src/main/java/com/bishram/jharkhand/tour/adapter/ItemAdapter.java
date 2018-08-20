package com.bishram.jharkhand.tour.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bishram.jharkhand.tour.R;

import java.util.ArrayList;

import com.bishram.jharkhand.tour.model.ItemModel;

public class ItemAdapter extends ArrayAdapter<ItemModel> {
    public ItemAdapter(Context context, ArrayList<ItemModel> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_model, parent,
                    false);
        }

        // Instantiate the current ItemModel of the list OBJECT;
        ItemModel currentItem = getItem(position);

        // Find the TEXT_VIEW, IMAGE_VIEW etc. reference of the layout file.
        ImageView imageViewBanner = convertView.findViewById(R.id.banner_image);
        TextView textViewBanner = convertView.findViewById(R.id.banner_title);
        TextView textViewStarsPoint = convertView.findViewById(R.id.im_tv_points);
        TextView textViewDistText = convertView.findViewById(R.id.im_tv_dis_txt);
        TextView textViewReviewsPoint = convertView.findViewById(R.id.im_tv_reviews);
        RatingBar ratingBar = convertView.findViewById(R.id.im_rb_ratings);

        // Checks whether or not the currentItem object is empty!
        assert currentItem != null;
        imageViewBanner.setImageResource(currentItem.getImageResource());
        textViewBanner.setText(currentItem.getImageName());
        textViewStarsPoint.setText(String.valueOf(currentItem.getStarsPoint()));
        ratingBar.setRating((float)currentItem.getStarsPoint());
        String reviewText = "( " + currentItem.getReviewsPoint() + " reviews)";
        textViewReviewsPoint.setText(reviewText);

        // Checks whether or not String for the DistanceText is available!
        if (currentItem.hasDistanceText()) {
            // If String is available then set that accordingly.
            textViewDistText.setText(currentItem.getDistanceText());
            textViewDistText.setSelected(true);

            // Make sure the view is visible to the user.
            textViewDistText.setVisibility(View.VISIBLE);
        } else {
            textViewDistText.setVisibility(View.INVISIBLE);
        }
        return convertView;
    }
}
