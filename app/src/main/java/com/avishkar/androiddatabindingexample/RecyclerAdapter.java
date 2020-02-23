package com.avishkar.androiddatabindingexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.avishkar.androiddatabindingexample.databinding.RowItemBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<User> users = new ArrayList<>();

    public RecyclerAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {




      /*  LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_item, parent, false);*/

        RowItemBinding rowItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()), R.layout.row_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(rowItemBinding);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        User user = users.get(position);
        holder.rowItemBinding.setUser(user);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        RowItemBinding rowItemBinding;

        public MyViewHolder(@NonNull RowItemBinding itemView) {
            super(itemView.getRoot());
            rowItemBinding = itemView;
        }
    }
}
