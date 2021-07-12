package com.example.codex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    public Context context;
    public List<RecItems> recItemsList;
    public CartAdapter(Context context, List<RecItems>recItemsList){
        this.context=context;
        this.recItemsList=recItemsList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_items, parent, false);
        return new CartAdapter.ViewHolder(view);*/
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {
        RecItems recItems = recItemsList.get(position);

        int cartImage = recItemsList.get(position).getRecFoodImage();
        String cartName = recItemsList.get(position).getRecFoodName();
        String cartRating = recItemsList.get(position).getRecFoodRating();
        String cartPrice = recItemsList.get(position).getRecFoodPrice();
        String cartDescription = recItemsList.get(position).getRecFoodDescription();

        holder.setData(cartImage,cartName,cartRating,cartPrice,cartDescription);
    }

    @Override
    public int getItemCount() {
        return recItemsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView CartFoodImage;
        private TextView CartFoodName;
        private TextView CartFoodRating;
        private TextView CartFoodPrice;
        private TextView CartFoodDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            CartFoodImage = itemView.findViewById(R.id.ImageCart);
            CartFoodName = itemView.findViewById(R.id.NameCart);
            CartFoodRating = itemView.findViewById(R.id.RatingCart);
            CartFoodPrice = itemView.findViewById(R.id.PriceCart);
            CartFoodDescription = itemView.findViewById(R.id.DescriptionCart);
        }

        public void setData(int cartImage, String cartName, String cartRating, String cartPrice, String cartDescription) {
            CartFoodImage.setImageResource(cartImage);
            CartFoodName.setText(cartName);
            CartFoodRating.setText(cartRating);
            CartFoodPrice.setText(cartPrice);
            CartFoodDescription.setText(cartDescription);
        }
    }
}
