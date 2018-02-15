package com.example.hanif.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
}
