package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewInfo>
{
    Context context;
    int images[];
    String names[];

    public MyAdapter(Context context, int[] images, String[] names, String[] release) {
        this.context = context;
        this.images = images;
        this.names = names;
        this.release = release;
    }

    String release[];
    @NonNull
    @Override
    public MyAdapter.ViewInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ViewInfo(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewInfo holder, int position) {
        holder.img.setImageResource(images[position]);
        holder.t_names.setText(names[position]);
        holder.t_release.setText(release[position]);
    }

    @Override
    public int getItemCount() {

        return images.length;
    }

    public class ViewInfo extends RecyclerView.ViewHolder {
        ImageView img;
        TextView t_names,t_release;
        public ViewInfo(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            t_names=itemView.findViewById(R.id.text1);
            t_release=itemView.findViewById(R.id.text2);
        }
    }
}
