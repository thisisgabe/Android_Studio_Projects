package com.hfad.starbuzz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gabriel on 2/17/16.
 */
public class DrinkAdapter extends ArrayAdapter<Drink> {
    public DrinkAdapter(Context context, ArrayList<Drink> drinks){
        super(context,0,drinks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the data item for this position
        Drink one_drink = getItem(position);
        //Check if an exisitng view is being reused, otherwise inflate the view
        if(convertView ==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.activity_drink, parent, false);
        }

        //lokup view for data population
        TextView drinkName = (TextView) convertView.findViewById(R.id.name);
        TextView drinkDesc = (TextView) convertView.findViewById(R.id.description);
        ImageView drinkPhoto = (ImageView) convertView.findViewById(R.id.photo);

        //POPULATE the data into the template view using the data object
        drinkName.setText(one_drink.getName());
        drinkDesc.setText(one_drink.getDescription());
        drinkPhoto.setImageResource(one_drink.getImageResourceId();
        drinkPhoto.setContentDescription(one_drink.getName());
        //Return the complete view to render on screen
        return convertView;
    }
}
