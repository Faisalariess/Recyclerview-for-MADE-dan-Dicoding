package com.kc.submissiondicoding;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListClubAdapter extends RecyclerView.Adapter<ListClubAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<Club> listClub;
    private View.OnClickListener onClick;


    public ListClubAdapter(Context context) {
        this.context = context;

    }

    private ArrayList<Club> getListClub() {
        return listClub;
    }

    void setListClub(ArrayList<Club> listClub) {
        this.listClub = listClub;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_club, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListClub().get(position).getName());
        categoryViewHolder.tvRemark.setText(getListClub().get(position).getRemark());

        Glide.with(context)
                .load(getListClub().get(position).getPhoto())
                .apply(new RequestOptions().override(75, 75))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListClub().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemark;
        ImageView imgPhoto;


        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemark = itemView.findViewById(R.id.tv_item_remark);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
