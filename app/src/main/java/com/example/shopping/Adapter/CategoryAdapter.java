package com.example.shopping.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import com.example.shopping.Domain.CategoryDomain;
import com.example.shopping.R;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    ArrayList<CategoryDomain> categoryDomains;

    public CategoryAdapter(ArrayList<CategoryDomain> categoryDomains) {
        this.categoryDomains = categoryDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category, parent, false);

        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.categoryName.setText(categoryDomains.get(position).getTitle());
        String picUrl="";
        switch (position) {
            case 0: {
                picUrl = "pizza";
                break;
            }
            case 1: {
                picUrl = "burger";
                break;
            }
            case 2: {
                picUrl = "hotdog";
                break;
            }
            case 3: {
                picUrl = "sald";
                break;
            }
            case 4: {
                picUrl = "drink";
                break;
            }
            case 5: {
                picUrl = "drink_2";
                break;
            }
            case 6: {
                picUrl = "juice";
                break;
            }
            case 7: {
                picUrl = "grilled_chicken";
                break;
            }
            case 8: {
                picUrl = "fried_eggs";
                break;
            }
            case 9: {
                picUrl = "fries";
                break;
            }
        }

        int drawableReourceId = holder.itemView.getContext().getResources()
                .getIdentifier(picUrl, "drawable",
                        holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableReourceId)
                .into(holder.categoryPic);

    }


    @Override
    public int getItemCount() {
        return categoryDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView categoryName;
        ImageView categoryPic;
        ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.categoryName);
            categoryPic = itemView.findViewById(R.id.categoryPic);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
