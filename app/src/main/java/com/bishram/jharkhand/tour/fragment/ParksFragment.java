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

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_parks, container, false);

        ArrayList<ItemModel> arrayList = new ArrayList<>();
        arrayList.add(new ItemModel("Name of the Banner", 5.0, 46, R.drawable.banner_01));
        arrayList.add(new ItemModel("Name of the Banner",5.0, 78, R.drawable.banner_02));
        arrayList.add(new ItemModel("Name of the Banner",5.0, 29, R.drawable.banner_03));
        arrayList.add(new ItemModel("Name of the Banner", 5.0,457, R.drawable.banner_04));
        arrayList.add(new ItemModel("Name of the Banner", 0.0,0,  R.drawable.banner_05));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), arrayList);

        ListView listViewFragmentOne = rootView.findViewById(R.id.fragment_eco_tour_list_view);

        listViewFragmentOne.setAdapter(itemAdapter);

        return rootView;
    }
}
