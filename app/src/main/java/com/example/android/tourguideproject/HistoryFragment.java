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

public class HistoryFragment extends Fragment {


    public HistoryFragment() {
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

        list.add(new List("Sultan Qaboos Mosque", "Muscat", "10 am - 12 pm", R.drawable.qaboos_mosque));
        list.add(new List("Mutrah Corniche", "Muscat", "10 am - 9 pm", R.drawable.muttrah_corn));
        list.add(new List("Jabrin Fort", "Nizwa", "10 am - 5 pm", R.drawable.jabrin_fort));


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