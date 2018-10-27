package ado.com.dfb.sampleday3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{
    private final int[] BUTTONS_IDS =
            {
                    R.id.btn_linear_horizontal,
                    R.id.btn_linear_vertical,
                    R.id.btn_relative_layout,
                    R.id.btn_table_layout,
                    R.id.btn_frame_layout,
                    R.id.btn_constraint_layout,
                    R.id.btn_list_view,
                    R.id.btn_grid_view,
                    R.id.btn_custom_adapter,
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int id: BUTTONS_IDS) findViewById(id).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_linear_vertical:
                goActivity(LinearLayoutVerticalActivity.class); break;
            case R.id.btn_linear_horizontal:
                goActivity(LinearLayoutHorizontalActivity.class); break;
            case R.id.btn_relative_layout:
                goActivity(RelativeLayoutActivity.class); break;
            case R.id.btn_table_layout:
                goActivity(TableLayoutActivity.class); break;
            case R.id.btn_constraint_layout:
                goActivity(ConstraintLayoutActivity.class); break;
            case R.id.btn_frame_layout:
                goActivity(FrameLayoutActivity.class); break;
            case R.id.btn_list_view:
                goActivity(ListViewActivity.class); break;
            case R.id.btn_grid_view:
                goActivity(GridViewActivity.class); break;
            case R.id.btn_custom_adapter:
                goActivity(CustomAdapterActivity.class); break;
        }
    }
    private void goActivity(Class<? extends AppCompatActivity> cls){
        startActivity(new Intent(MainActivity.this, cls));
    }
}
