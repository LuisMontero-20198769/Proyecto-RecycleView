package com.example.lr;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListElement> mDta;
    private LayoutInflater mInflater;
    private Context context;


    //constructor de la clase....
    public ListAdapter(List<ListElement> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mDta = itemList;
    }

    @Override
    public int getItemCount(){
        return this.mDta.size();
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup paremt, int viewType){
        View view = mInflater.inflate(R.layout.list_elementos, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
        holder.bindData(mDta.get(position));
    }

    public void setItems(List<ListElement> items){
        mDta = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView nombre, descrip;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImageView);
            nombre =  itemView.findViewById(R.id.txt_aliemento);
            descrip = itemView.findViewById(R.id.txt_descrip);
        }

        void bindData(final ListElement item){
             iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
             nombre.setText(item.getNombre());
             descrip.setText(item.getDescrip());
        }
    }


}
