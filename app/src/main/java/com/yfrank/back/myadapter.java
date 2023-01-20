package com.yfrank.back;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {

    model data[];

    public myadapter(model[] data) {
        this.data = data;
    }

    @NonNull
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }
    public void onBindViewHolder(@NonNull myviewholder holder, int position){
        holder.t1.setText(data[position].getUNIVERSITY_TYPE_ID());
        holder.t2.setText(data[position].getNAME());
    }
    public int getItemCount(){
        return  data.length;
    }

    class myviewholder extends RecyclerView.ViewHolder{
        TextView t1,t2;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
        }
    }

}
