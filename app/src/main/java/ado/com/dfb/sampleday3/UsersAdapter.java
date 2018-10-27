package ado.com.dfb.sampleday3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class UsersAdapter extends ArrayAdapter<User> {

    public UsersAdapter(Context context,
                        List<User> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position,
                        View convertView,
                        ViewGroup parent) {
        User user = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_user,parent,false);
        }
        TextView lblName = convertView.findViewById(R.id.lbl_name);
        TextView lblAddress = convertView.findViewById(R.id.lbl_address);
        lblName.setText(user.getName());
        lblAddress.setText(user.getAddress());
        return convertView;
    }
}
