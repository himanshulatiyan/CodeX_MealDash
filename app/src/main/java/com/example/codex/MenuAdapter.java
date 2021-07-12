
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

import com.example.codex.menu.VegS.VegStarters;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    public Context context2;
    public List<MenuItems> menuItemsList;
    public MenuAdapter(Context context2, List<MenuItems>menuItemsList){
        this.context2 = context2;
        this.menuItemsList = menuItemsList; }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_items, parent ,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, int position) {
        int mImage = menuItemsList.get(position).getMenuFoodImage();
        String mName = menuItemsList.get(position).getMenuFoodName();

        holder.setData(mImage, mName);
    }

    @Override
    public int getItemCount() {
        return menuItemsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView MenuFoodImage;
        private TextView MenuFoodName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            MenuFoodImage = itemView.findViewById(R.id.MenuFoodImage);
            MenuFoodName = itemView.findViewById(R.id.MenuFoodName);
            MenuFoodImage.setOnClickListener(this);
        }

        public void setData(int mImage, String mName) {
            MenuFoodImage.setImageResource(mImage);
            MenuFoodName.setText(mName);
        }

        @Override
        public void onClick(View view) {
            int position = this.getAdapterPosition();
            MenuItems menuItems = menuItemsList.get(position);
//            Integer MenuFoodImage = menuItems.getMenuFoodImage();
            String MenuFoodName = menuItems.getMenuFoodName();
//            Toast.makeText(context2, "hi", Toast.LENGTH_SHORT).show();

            Intent intent2 = new Intent(context2, VegStarters.class);
//            if(position == 0)
                intent2.putExtra("pos", position);
                intent2.putExtra("CaName", MenuFoodName);
                context2.startActivity(intent2);
//            Intent intent3 = new Intent(context2, VegStarters.class);
//            if(position==1)
//                context2.startActivity(intent3);
//            Intent intent4 = new Intent(context2, .class);
//            if(position==2)
//                context2.startActivity(intent4);
        }
    }
}
