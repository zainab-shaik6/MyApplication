package com.example.interview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class Adapterfile extends RecyclerView.Adapter<Adapterfile.ViewHolder> {

    Context context;
    private LayoutInflater mInflater;
    List<EmailNumber> emailnumber;

    public Adapterfile(Context context,  List<EmailNumber>emailnumber) {
        this.context=context;
        this.emailnumber = emailnumber;
        mInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=mInflater.inflate(R.layout.activity_adapterfile,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.email.setText(emailnumber.get(position).getEmail());
        holder.number.setText(emailnumber.get(position).getNumber());
    }


    @Override
    public int getItemCount() {
        return emailnumber.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView email;
        TextView number;
        LinearLayout LinearLayout;


        ViewHolder(View view) {
            super(view);

            email=view.findViewById(R.id.email);
            number=view.findViewById(R.id.number);
            LinearLayout=view.findViewById(R.id.leniar_layout);

        }

    }
}