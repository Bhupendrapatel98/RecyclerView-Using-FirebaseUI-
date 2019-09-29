package com.example.recylerviewfirebase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Adapter extends FirebaseRecyclerAdapter<Post, Adapter.PostViewHolder>{

    public Adapter(@NonNull FirebaseRecyclerOptions<Post> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull PostViewHolder holder, int position, @NonNull Post model) {
        holder.name.setText(model.getName());
        holder.email.setText(model.getEmail());
        holder.number.setText(model.getNumber());

    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.post,parent,false);
        return new PostViewHolder(view);
    }

    class PostViewHolder extends RecyclerView.ViewHolder {

        private TextView name,email,number;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            email=itemView.findViewById(R.id.email);
            number=itemView.findViewById(R.id.number);
        }
    }
}
