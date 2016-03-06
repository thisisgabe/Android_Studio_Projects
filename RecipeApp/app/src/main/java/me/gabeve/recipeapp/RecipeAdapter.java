package me.gabeve.recipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Gabriel on 2/22/16.
 */
public class RecipeAdapter extends ArrayAdapter<Recipe> {
    public RecipeAdapter(Context context, Recipe[] recipes) {
        super(context, recipes);
    }
}
