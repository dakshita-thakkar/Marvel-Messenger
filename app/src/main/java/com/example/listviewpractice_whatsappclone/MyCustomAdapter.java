package com.example.listviewpractice_whatsappclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<User> {

    private ArrayList<User> userArrayList;

    Context context;

    public MyCustomAdapter(@NonNull Context context, ArrayList<User> userArrayList) {
        super(context, R.layout.item_list, userArrayList);
        this.userArrayList = userArrayList;
        this.context = context;
    }

    private static class MyViewHolder{
        ImageView userImage;
        TextView userName;
        TextView message;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        User users = getItem(position);
        MyViewHolder myViewHolder = new MyViewHolder();

        final View result;

        if(convertView==null){

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list,parent,false);

            myViewHolder.userImage = (ImageView) convertView.findViewById(R.id.userImage);
            myViewHolder.userName = (TextView) convertView.findViewById(R.id.userName);
            myViewHolder.message = (TextView) convertView.findViewById(R.id.message);

            result = convertView;
            convertView.setTag(myViewHolder);


        }else{

            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;

        }

        myViewHolder.userImage.setImageResource(users.getUserImage());
        myViewHolder.userName.setText(users.getUserName());
        myViewHolder.message.setText(users.getMessage());

        return result;

    }

}
