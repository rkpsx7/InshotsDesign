package com.example.inshotsdesign;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {

    private ImageView iv_pic;
    private TextView title1, title2;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        iv_pic = itemView.findViewById(R.id.iv_pic);
        title1 = itemView.findViewById(R.id.tv_title1);
        title2 = itemView.findViewById(R.id.tv_title2);
    }

    public void setData(ResponseDTOItem item) {
        Glide.with(iv_pic).load(item.getImage()).into(iv_pic);
        title1.setText(item.getTitle());
        title2.setText(item.getSubTitle());
    }


}
