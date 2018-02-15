package com.example.hanif.myrecyclerview;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HANIF on 15/02/2018.
 */

public class ListPresidentAdapter extends RecyclerView.Adapter<ListPresidentAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<ListPresidentAdapter> listPresident;

    public ListPresidentAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<ListPresidentAdapter> getListPresident() {
        return listPresident;
    }

    public void setListPresident(ArrayList<ListPresidentAdapter> listPresident) {
        this.listPresident = listPresident;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
        }
    }


}
