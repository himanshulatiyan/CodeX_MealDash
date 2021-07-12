package com.example.codex;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder> {
    public Context context;
    public List<RecItems> recItemsList;
    public RecAdapter(Context context, List<RecItems>recItemsList){
        this.context=context;
        this.recItemsList=recItemsList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecAdapter.ViewHolder holder, int position) {
        RecItems recItems = recItemsList.get(position);

        int fImage = recItemsList.get(position).getRecFoodImage();
        String fName = recItemsList.get(position).getRecFoodName();
        String fRating = recItemsList.get(position).getRecFoodRating();
        String fPrice = recItemsList.get(position).getRecFoodPrice();
        String fDescription = recItemsList.get(position).getRecFoodDescription();
        holder.setData(fImage,fName,fRating,fPrice,fDescription);
    }

    @Override
    public int getItemCount() {
        return recItemsList.size();
    }

    public void filterList(ArrayList<RecItems> filteredList) {
        recItemsList = filteredList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView RecFoodImage;
        private TextView RecFoodName;
        private TextView RecFoodRating;
        private TextView RecFoodPrice;
        private TextView RecFoodDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            RecFoodImage = itemView.findViewById(R.id.fImage);
            RecFoodName = itemView.findViewById(R.id.RecFoodName);
            RecFoodRating = itemView.findViewById(R.id.RecFoodRating);
            RecFoodPrice = itemView.findViewById(R.id.RecFoodPrice);
            RecFoodDescription = itemView.findViewById(R.id.fDescription);

            RecFoodImage.setOnClickListener(this);
        }

        public void setData(int fImage, String fName, String fRating, String fPrice, String fDescription) {

        RecFoodImage.setImageResource(fImage);
        RecFoodName.setText(fName);
        RecFoodRating.setText(fRating);
        RecFoodPrice.setText(fPrice);
        RecFoodDescription.setText(fDescription);
        }

        @Override
        public void onClick(View view) {
            int position = this.getAdapterPosition();
            RecItems recItems = recItemsList.get(position);
            Integer RecFoodImage = recItems.getRecFoodImage();
            String RecFoodName = recItems.getRecFoodName();
            String RecFoodRating = recItems.getRecFoodRating();
            String RecFoodPrice = recItems.getRecFoodPrice();
            String RecFoodDescription = recItems.getRecFoodDescription();
//            Toast.makeText(context,"Hey", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(context, FoodDetail.class);
            intent.putExtra("Image", RecFoodImage);
            intent.putExtra("Name", RecFoodName);
            intent.putExtra("Rating", RecFoodRating);
            intent.putExtra("Price", RecFoodPrice);
            intent.putExtra("Description",RecFoodDescription);
            context.startActivity(intent);
        }
    }
}
