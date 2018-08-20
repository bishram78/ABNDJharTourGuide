package com.bishram.jharkhand.tour.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bishram.jharkhand.tour.R;

import java.util.ArrayList;

import com.bishram.jharkhand.tour.model.ItemModel;
import com.bishram.jharkhand.tour.adapter.ItemAdapter;

public class WaterfallFragment extends Fragment {

    public WaterfallFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_waterfalls, container, false);

        ArrayList<ItemModel> arrayList = new ArrayList<>();
        arrayList.add(new ItemModel("Hirni Fall",5.0, 50, R.drawable.hirni_fall_01));
        arrayList.add(new ItemModel("Dassam Fall", 4.6, 46, R.drawable.dassam_fall_01));
        arrayList.add(new ItemModel("Lodh Waterfall (Netarhat)", 4.8, 48, R.drawable.lodh_fall_01));
        arrayList.add(new ItemModel("Sita Fall", 4.1, 41, R.drawable.sita_fall_01));
        arrayList.add(new ItemModel("Lawapani Waterfall",3.0, 30, R.drawable.lavapani_fall_01));
        arrayList.add(new ItemModel("Hundru Fall",3.8, 38, R.drawable.hundru_fall_01));
        arrayList.add(new ItemModel("Ursi Fall (Giridih)", 3.6,36, R.drawable.usri_fall_01));
        arrayList.add(new ItemModel("Mirchaiya Waterfall (Latehar)", 4.0, 40, R.drawable.mirchaiya_fall_01));
        arrayList.add(new ItemModel("Panch Ghat Fall",3.9, 39, R.drawable.panch_ghat_fall_01));
        arrayList.add(new ItemModel("Kanti Fall", 5.0, 50, R.drawable.kanti_fall_01));
        arrayList.add(new ItemModel("Suga Bandh Waterfall (Latehar)", 3.2, 320, R.drawable.suga_bandh_fall_01));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), arrayList);

        ListView listViewFragmentOne = rootView.findViewById(R.id.fragment_waterfalls_list_view);

        listViewFragmentOne.setAdapter(itemAdapter);

        return rootView;
    }
}
