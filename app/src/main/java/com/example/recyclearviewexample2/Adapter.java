package com.example.recyclearviewexample2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ModelClass> userlist;

    public Adapter(List<ModelClass> userlist) {
        this.userlist = userlist;
    }


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull Adapter.ViewHolder holder, int position) {
        int resource =userlist.get(position).getImageview1();
        String name = userlist.get(position).getTextview1();
        String msg = userlist.get(position).getTextview3();
        String time = userlist.get(position).getTextview2();
        String line = userlist.get(position).getDivider();

        holder.setData(resource,name,msg,time,line);

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;
        private TextView divider;


        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            itemView=itemView.findViewById(R.id.imageview1);
            textView1=itemView.findViewById(R.id.textview1);
            textView2=itemView.findViewById(R.id.textview2);
            textView3=itemView.findViewById(R.id.textview3);
            divider=itemView.findViewById(R.id.divider);


        }

        public void setData(int resource, String name, String msg, String time, String line) {

            imageView.setImageResource(resource);
            textView1.setText(name);
            textView3.setText(msg);
            textView2.setText(time);
            divider.setText(line);
        }
    }
}
