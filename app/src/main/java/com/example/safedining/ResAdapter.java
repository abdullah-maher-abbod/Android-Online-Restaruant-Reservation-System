package com.example.safedining;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.squareup.picasso.Picasso;

public class ResAdapter extends FirebaseRecyclerAdapter<
        Res, ResAdapter.RestaurantViewholder> {

    public ResAdapter(
            @NonNull FirebaseRecyclerOptions<Res> options)
    {
        super(options);

    }

    // Function to bind the view in Card view(here
    // "person.xml") iwth data in
    // model class(here "person.class")
    @Override
    protected void
    onBindViewHolder(@NonNull RestaurantViewholder holder,
                     int position, @NonNull Res model)
    {

        // Add firstname from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.name.setText(model.getName());

        // Add lastname from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.category.setText(model.getCategory());

        // Add age from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.rate.setText(model.getRate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Res_page.class);
                v.getContext().startActivity(intent);
            }
        });

        Picasso.get().load(model.getImage()).into(holder.image);
    }

    // Function to tell the class about the Card view (here
    // "person.xml")in
    // which the data will be shown
    @NonNull
    @Override
    public RestaurantViewholder
    onCreateViewHolder(@NonNull ViewGroup parent,
                       int viewType)
    {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.res_recyclerview, parent, false);
        return new ResAdapter.RestaurantViewholder(v);
    }

    // Sub Class to create references of the views in Crad
    // view (here "person.xml")
    static class RestaurantViewholder
            extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name, category, rate;
        //View v;

        public RestaurantViewholder(@NonNull View itemView)
        {
            super(itemView);

            name = itemView.findViewById(R.id.title_r);
            category = itemView.findViewById(R.id.category);
            rate = itemView.findViewById(R.id.rate);
            image = itemView.findViewById(R.id.iv_r_item);
        }
    }
}
