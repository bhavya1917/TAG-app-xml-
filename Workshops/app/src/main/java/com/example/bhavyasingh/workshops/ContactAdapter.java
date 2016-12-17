package com.example.bhavyasingh.workshops;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BHAVYA SINGH on 17-12-2016.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder>{
    ArrayList<Contact>contacts=new ArrayList<Contact>();

    public ContactAdapter(ArrayList<Contact> contacts){
        this.contacts=contacts;
    }



    @Override
    public  ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        ContactViewHolder contactViewHolder=new ContactViewHolder(view);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Contact CON=contacts.get(position);
        holder.person_img.setImageResource(CON.getImage_id());
        holder.person_name.setText(CON.getName());
        holder.person_email.setText(CON.getEmail());
        holder.person_mobile.setText(CON.getMobile());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder{

        ImageView person_img;
        TextView person_name,person_email,person_mobile;

        public ContactViewHolder(View view){
            super(view);
            person_img=(ImageView) view.findViewById(R.id.person_image);
            person_name=(TextView)view.findViewById(R.id.person_name);
            person_email=(TextView)view.findViewById(R.id.person_email);
            person_mobile=(TextView)view.findViewById(R.id.person_mobile);

        }

    }
}
