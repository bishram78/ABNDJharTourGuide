package com.bishram.jharkhand.tour.fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.bishram.jharkhand.tour.R;

import java.util.ArrayList;
import java.util.Objects;

import com.bishram.jharkhand.tour.activity.DetailActivity;
import com.bishram.jharkhand.tour.activity.MainActivity;
import com.bishram.jharkhand.tour.model.ItemModel;
import com.bishram.jharkhand.tour.adapter.ItemAdapter;

public class DamsLakesFragment extends Fragment {

    public DamsLakesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dams_lakes, container, false);

        ArrayList<ItemModel> arrayList = new ArrayList<>();
        arrayList.add(new ItemModel(getString(R.string.netarhat_dam_latehar), 4.3, 78, "1.5 – 2 kms from the Netarhat bus-stand", R.drawable.netarhat_dam_01));
        arrayList.add(new ItemModel(getString(R.string.chandil_dam_tata), 3.6, 57, "22 kms north of Jamshedpur", R.drawable.chandil_dam_01));
        arrayList.add(new ItemModel(getString(R.string.hatia_dam_dhurwa), 2.9, 80, "15 Kms from the city", R.drawable.hatia_dam_01));
        arrayList.add(new ItemModel(getString(R.string.patratu_dam_ranchi),4.0,377, "35 km from Ranchi", R.drawable.patratu_dam_01));
        arrayList.add(new ItemModel(getString(R.string.tilaiya_dam_ramgarh),1.8, 27, "Whispering island", R.drawable.tilaiya_dam_01));
        arrayList.add(new ItemModel(getString(R.string.tenughat_dam_bokaro),4.6, 39, "75 kms from Bokaro", R.drawable.tenughat_dam_01));
        arrayList.add(new ItemModel(getString(R.string.massanjore_dam_dumka),3.0, 44, "25 kms from Dumka", R.drawable.massanjore_dam_01));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), arrayList);

        ListView listViewFragmentOne = rootView.findViewById(R.id.fragment_dams_lakes_list_view);

        listViewFragmentOne.setAdapter(itemAdapter);

        listViewFragmentOne.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(Objects.requireNonNull(getActivity()).getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity().getApplication(), DetailActivity.class));
            }
        });

        return rootView;
    }
}
