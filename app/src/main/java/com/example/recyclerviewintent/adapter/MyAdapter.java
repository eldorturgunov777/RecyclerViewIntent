package com.example.recyclerviewintent.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewintent.R;
import com.example.recyclerviewintent.model.ListData;
import com.example.recyclerviewintent.view.SecondActivity;

import java.util.List;

/**
 * Created by Eldor Turgunov
 * Project: RecyclerView Intent
 * Date: 03.03.2022
 * Time: 10:02
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private final Context context;
    private final List<ListData> list;

    public MyAdapter(Context context, List<ListData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListData data = list.get(position);
        holder.imageView.setImageResource(data.getImage());
        holder.textView.setText(data.getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            textView = itemView.findViewById(R.id.tv_title);
            imageView = itemView.findViewById(R.id.iv_image);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

            ListData listData = list.get(position);

            Intent intent = new Intent(context, SecondActivity.class);
            intent.putExtra("img", listData.getImage());
            intent.putExtra("title", listData.getTitle());

            context.startActivity(intent);


        }
    }
}
