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

public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
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

        list.add(new List(getString(R.string.marah_land), getString(R.string.qurum_muscat), "10 am - 10 pm", R.drawable.marah_land));
        list.add(new List(getString(R.string.trampo_oman), getString(R.string.ghala_muscat), "10 am - 10 pm", R.drawable.trampo));

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