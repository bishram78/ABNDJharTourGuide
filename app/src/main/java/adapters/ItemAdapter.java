package adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bishram.jharkhand.tour.R;

import java.util.ArrayList;

import CardViewModel.ItemModel;

public class ItemAdapter extends ArrayAdapter<ItemModel> {
    public ItemAdapter(Context context, ArrayList<ItemModel> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_model, parent, false);
        }

        ItemModel currentItem = getItem(position);

        ImageView imageViewBanner = convertView.findViewById(R.id.banner_image);
        TextView textViewBanner = convertView.findViewById(R.id.banner_title);

        assert currentItem != null;
        imageViewBanner.setImageResource(currentItem.getImageResource());
        textViewBanner.setText(currentItem.getImageName());

        return convertView;
    }
}
