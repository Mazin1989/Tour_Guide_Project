package com.example.android.tourguideproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */

public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_list, container, false);

        //TODO all code of activity to be written here

        //create an ArrayList of List objects
        final ArrayList<List> list = new ArrayList<List>();

        list.add(new List(getString(R.string.mumtaz_mahal), getString(R.string.muscat), getString(R.string.time_12pm_11pm), R.drawable.mumtaz_mahal));
        list.add(new List(getString(R.string.golden_oryx), getString(R.string.muscat), getString(R.string.time_12pm_12am), R.drawable.golden_oryx));

        ListAdapter adapter = new ListAdapter(getActivity(), list);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter((android.widget.ListAdapter) adapter);

        return rootView;
    }


    @Override
    public void onStop() {
        super.onStop();
    }
}