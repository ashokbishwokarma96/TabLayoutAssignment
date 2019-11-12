package com.meroapp.tablayoutassignment.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.meroapp.tablayoutassignment.DisplayMain;
import com.meroapp.tablayoutassignment.R;
import com.meroapp.tablayoutassignment.model.Contacts;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {

    Context mContext;
    List<Contacts> contactsList;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_contacts,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {

        final Contacts contacts = contactsList.get(position);
        holder.imgProfile.setImageResource(contacts.getImageId());
        holder.tvName.setText(contacts.getName());
        holder.tvPhone.setText(contacts.getPhoneNo());

        holder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DisplayMain.class);
                intent.putExtra("image",contacts.getImageId());
                intent.putExtra("name",contacts.getName());
                intent.putExtra("number",contacts.getPhoneNo());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {

        CircleImageView imgProfile;
        TextView tvName,tvPhone;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imageProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
        }
    }
}
