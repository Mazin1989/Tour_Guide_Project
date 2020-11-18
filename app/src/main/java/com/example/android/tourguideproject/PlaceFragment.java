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

public class PlaceFragment extends Fragment {


    public PlaceFragment() {
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

        list.add(new List(getString(R.string.qaboos_mosque), getString(R.string.muscat), getString(R.string.time_10am_12pm), R.drawable.qaboos_mosque));
        list.add(new List(getString(R.string.mutrah_corn), getString(R.string.muscat), getString(R.string.time_10am_9pm), R.drawable.muttrah_corn));
        list.add(new List(getString(R.string.jabrin_fort), getString(R.string.nizwa), getString(R.string.time_10am_5pm), R.drawable.jabrin_fort));


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