package ado.com.dfb.sampleday3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        ListView listView = findViewById(R.id.list_view);

        List<User> users = new ArrayList<>();
        users.add(new User("Dante Fana","Manzana u3 #9, Std. Dgo."));
        users.add(new User("Dante Fana","Manzana u3 #9, Std. Dgo."));
        users.add(new User("Dante Fana","Manzana u3 #9, Std. Dgo."));
        users.add(new User("Dante Fana","Manzana u3 #9, Std. Dgo."));
        users.add(new User("Dante Fana","Manzana u3 #9, Std. Dgo."));
        users.add(new User("Dante Fana","Manzana u3 #9, Std. Dgo."));
        users.add(new User("Dante Fana","Manzana u3 #9, Std. Dgo."));
        users.add(new User("Dante Fana","Manzana u3 #9, Std. Dgo."));
        users.add(new User("Dante Fana","Manzana u3 #9, Std. Dgo."));
        users.add(new User("Dante Fana","Manzana u3 #9, Std. Dgo."));

        listView.setAdapter(new UsersAdapter(this,users));
    }
}
