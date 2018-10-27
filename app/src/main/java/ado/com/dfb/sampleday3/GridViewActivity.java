package ado.com.dfb.sampleday3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        GridView myGridView = findViewById(R.id.grid_view);
        List<String> data = new ArrayList<>();
        for(int i = 0; i < 100; i++)
            data.add(String.format("Item: %d", i+1));
        myGridView.setAdapter(
                new ArrayAdapter<>(this, R.layout.text_view_item, data)
        );
    }
}
