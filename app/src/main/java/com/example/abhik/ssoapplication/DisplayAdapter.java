package com.example.abhik.ssoapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by abhik on 10/02/18.
 */

public class DisplayAdapter extends RecyclerView.Adapter<DisplayAdapter.DispViewHolder> {

    private Context context;

    @Override
    public DispViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DispViewHolder holder, int position) {

    }

    public DisplayAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    class DispViewHolder extends RecyclerView.ViewHolder{
        TextView tv1, tv2;
        CheckBox cb;

        public DispViewHolder(View itemView) {
            super(itemView);

            tv1 = (TextView) itemView.findViewById(R.id.tv_desctax);
            tv2 = (TextView) itemView.findViewById(R.id.tv_moneydiv);
            cb = (CheckBox) itemView.findViewById(R.id.cb_box);
        }

    }
}
