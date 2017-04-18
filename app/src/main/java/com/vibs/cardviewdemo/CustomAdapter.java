package com.vibs.cardviewdemo;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by root on 17/4/17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<InfoGetAndSet> infoGetAndSetList;
    private Activity activity;

    public CustomAdapter(Activity activity,List<InfoGetAndSet> infoGetAndSetList){
        this.activity=activity;
        this.infoGetAndSetList=infoGetAndSetList;
    }
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.card_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        holder.name.setText(infoGetAndSetList.get(position).getName());
        holder.job.setText(infoGetAndSetList.get(position).getDesignation());
        if (infoGetAndSetList.get(position).isGender()) {
            holder.imageView.setImageResource(R.mipmap.male);
        } else {
            holder.imageView.setImageResource(R.mipmap.female);
        }

    }

    @Override
    public int getItemCount() {
        return (null != infoGetAndSetList ? infoGetAndSetList.size() : 0);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView name;
        private TextView job;
        private View container;

        public ViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.image);
            name = (TextView) view.findViewById(R.id.name);
            job = (TextView) view.findViewById(R.id.job);
            container = view.findViewById(R.id.main_cardview);
        }
    }

}
