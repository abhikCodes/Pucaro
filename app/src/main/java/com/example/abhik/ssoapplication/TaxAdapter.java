package com.example.abhik.ssoapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abhik on 10/02/18.
 */

public class TaxAdapter
        extends RecyclerView.Adapter<TaxAdapter.TaxViewHolder> {

    private Context context;
    ArrayList<Tax> taxArrayList;
    public static final String TAG = "adptr";


    public TaxAdapter(ArrayList<Tax> taxArrayList,Context context) {
        Log.d(TAG, "TaxAdapter: 1");
        this.context = context;
        this.taxArrayList = taxArrayList;
    }


    @Override
    public TaxViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int layouttype;
        layouttype = R.layout.taxt_layout;
        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = li.inflate(layouttype, parent, false);
        TaxViewHolder taxViewHolder = new TaxViewHolder(itemView);
        Log.d(TAG, "onCreateViewHolder: 2");
        return taxViewHolder;
    }

    @Override
    public void onBindViewHolder(TaxViewHolder holder, int position) {

        Tax thisTAx = taxArrayList.get(position);
        holder.tv1.setText(thisTAx.getTotal());
        holder.tv2.setText(thisTAx.getTaxYear());
        holder.tv3.setText(thisTAx.getTaxID());
        Log.d(TAG, "onBindViewHolder: 3");
    }

    @Override
    public int getItemCount() {
        return taxArrayList.size();
    }

    static class TaxViewHolder extends RecyclerView.ViewHolder{

        TextView tv1, tv2,tv3;
        LinearLayout layt;

        public TaxViewHolder(View itemView) {
            super(itemView);

            tv1 = (TextView) itemView.findViewById(R.id.tv_tottax);
            tv2 = (TextView) itemView.findViewById(R.id.tv_taxyear);
            tv3 = (TextView) itemView.findViewById(R.id.tv_taxid);
            Log.d(TAG, "TaxViewHolder: 4");
        }
    }
}

