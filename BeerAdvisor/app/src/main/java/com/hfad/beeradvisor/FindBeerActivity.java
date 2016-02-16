package com.hfad.beeradvisor;
import android.os.Bundle; import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer); }

    public void onClickFindBeer(View view){
        //get the textview id
        TextView brands = (TextView) findViewById(R.id.brands);
        //get spinner id
        Spinner color = (Spinner) findViewById(R.id.color);
        //get the item in the spinner
        String BeerType = String.valueOf(color.getSelectedItem());
        //display the beer
        List<String> brandsList = expert.getBrands(BeerType);
        StringBuilder brandsFormatted = new StringBuilder();

        for(String brand : brandsList){
            brandsFormatted.append(brand).append('\n');
        }

        //display the beers
        brands.setText(brandsFormatted);

    }
}
