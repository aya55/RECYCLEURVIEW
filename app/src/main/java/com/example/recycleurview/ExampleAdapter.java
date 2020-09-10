package com.example.recycleurview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.EampleViewHolder> {
    private  ArrayList<exampleItem>mExampleList;
    public  static class  EampleViewHolder extends RecyclerView.ViewHolder{
public ImageView mImageView;
public TextView mTextView1;
public  TextView mTextView2;

        public EampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.imageView);
            mTextView1=itemView.findViewById(R.id.textView);
            mTextView2=itemView.findViewById(R.id.textView2);

        }
    }
   public  ExampleAdapter(ArrayList<exampleItem> exampleList){
        mExampleList=exampleList;

   }
    @NonNull
    @Override
    public EampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent,false);
        EampleViewHolder evh=new EampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull EampleViewHolder holder, int position) {
   exampleItem currentItem=mExampleList.get(position);
   holder.mImageView.setImageResource(currentItem.getmImageRrsource());
   holder.mTextView1.setText(currentItem.getmText1());
    holder.mTextView2.setText(currentItem.getmText2());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
