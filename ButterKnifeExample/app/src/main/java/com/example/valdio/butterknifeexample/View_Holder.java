package com.example.valdio.butterknifeexample;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Valdio Veliu on 16-07-08.
 */
public class View_Holder extends RecyclerView.ViewHolder {

    @BindView(R.id.cardView)
    CardView cv;
    @BindView(R.id.textView)
    TextView title;
    @BindView(R.id.imageView)
    ImageView imageView;

    View_Holder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}