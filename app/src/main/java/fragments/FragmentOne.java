package fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bishram.jharkhand.tour.R;

import java.util.ArrayList;

import CardViewModel.ItemModel;
import adapters.ItemAdapter;

public class FragmentOne extends Fragment {

    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        ArrayList<ItemModel> arrayList = new ArrayList<>();
        arrayList.add(new ItemModel("Name of the Banner", R.drawable.banner_01));
        arrayList.add(new ItemModel("Name of the Banner", R.drawable.banner_02));
        arrayList.add(new ItemModel("Name of the Banner", R.drawable.banner_03));
        arrayList.add(new ItemModel("Name of the Banner", R.drawable.banner_04));
        arrayList.add(new ItemModel("Name of the Banner", R.drawable.banner_05));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), arrayList);

        ListView listViewFragmentOne = rootView.findViewById(R.id.fragment_one_list_view);

        listViewFragmentOne.setAdapter(itemAdapter);

        return rootView;
    }
}
