package com.example.android.tourguideproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<List> {


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param list    A List of list objects to display in a ViewList
     */
    public ListAdapter(Activity context, ArrayList<List> list) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for four TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, list);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        // Get the {@link List} object located at this position in the list
        List currentList = getItem(position);

        // Find the attraction name TextView in the item_list.xml layout
        TextView name = (TextView) listItemView.findViewById(R.id.attraction_name_text_view);
        // Get the name from the current List object and
        // set this text on the attraction name TextView
        name.setText(currentList.getName());

        // Find the location TextView in the item_list.xml layout
        TextView location = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the location from the current List object and
        // set this text on the attraction location TextView
        location.setText(currentList.getLocation());

        // Find the time TextView in the item_list.xml layout
        TextView time = (TextView) listItemView.findViewById(R.id.opening_time_text_view);
        // Get the time from the current List object and
        // set this text on the attraction time TextView
        time.setText(currentList.getTime());


        // Find the ImageView in the list_item.xml layout
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current List object

        if (currentList.hasImage()) {
            // set the image
            image.setImageResource(currentList.getImageResourceId());

            //make sure the view is visibile
            image.setVisibility(View.VISIBLE);
        }

        //Otherwise hide the image
        else {
            image.setVisibility(View.GONE);
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

