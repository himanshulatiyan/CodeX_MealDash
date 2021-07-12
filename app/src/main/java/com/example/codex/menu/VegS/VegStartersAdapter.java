package com.example.codex.menu.VegS;

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

import com.example.codex.FoodDetail;
import com.example.codex.R;

import java.util.List;

public class VegStartersAdapter extends RecyclerView.Adapter<VegStartersAdapter.ViewHolder> {
    public Context contextvs;
    List<Foodparams> foodparamsList;

    public VegStartersAdapter(Context contextvs, List<Foodparams> foodparamsList) {
        this.contextvs = contextvs;
        this.foodparamsList = foodparamsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_items_list, parent ,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VegStartersAdapter.ViewHolder holder, int position) {
        int cImage = foodparamsList.get(position).getImagef();
        String cName = foodparamsList.get(position).getNamef();
        String cRating = foodparamsList.get(position).getRatingf();
        String cPrice = foodparamsList.get(position).getPricef();
        String cDescription = foodparamsList.get(position).getDescriptionf();

        holder.setData(cImage, cName, cRating, cPrice, cDescription);
    }

    @Override
    public int getItemCount() {
        return foodparamsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView Imagef;
        private TextView Namef;
        private TextView Ratingf;
        private TextView Pricef;
        private TextView Descriptionf;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            Imagef = itemView.findViewById(R.id.Imagefood);
            Namef = itemView.findViewById(R.id.Namefood);
            Ratingf = itemView.findViewById(R.id.Ratingfood);
            Pricef = itemView.findViewById(R.id.Pricefood);
            Descriptionf = itemView.findViewById(R.id.DescriptionFood);

            Imagef.setOnClickListener(this);
        }

        public void setData(int cImage, String cName, String cRating, String cPrice, String cDescription) {
            Imagef.setImageResource(cImage);
            Namef.setText(cName);
            Ratingf.setText(cRating);
            Pricef.setText(cPrice);
            Descriptionf.setText(cDescription);
        }

        @Override
        public void onClick(View v) {
            int position = this.getAdapterPosition();
            Foodparams foodparams = foodparamsList.get(position);
            Integer Imagef = foodparams.getImagef();
            String Namef = foodparams.getNamef();
            String Ratingf = foodparams.getRatingf();
            String  Pricef = foodparams.getPricef();
            String  Descriptionf = foodparams.getDescriptionf();
            //Toast.makeText(contextvs, "hi", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(contextvs, FoodDetail.class);
            intent.putExtra("Image", Imagef);
            intent.putExtra("Name", Namef);
            intent.putExtra("Rating", Ratingf);
            intent.putExtra("Price", Pricef);
            intent.putExtra("Description",Descriptionf);
            contextvs.startActivity(intent);
        }
    }
}
