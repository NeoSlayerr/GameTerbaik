package com.dicoding.picodiploma.mysubmission;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListGameAdapter extends RecyclerView.Adapter<ListGameAdapter.ListViewHolder> {



    private ArrayList<Game> listGame;

    public ListGameAdapter(ArrayList<Game> list) {
        this.listGame = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_games, viewGroup, false);

        return new ListViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Game game = listGame.get(position);
        Glide.with(holder.itemView.getContext())
                .load(game.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(game.getName());
        holder.tvDetail.setText(game.getDetail());

        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                final Intent intent;

                Context context =v.getContext();
                switch(position){
                    case 0:
                        intent = new Intent(context, Tetris.class);
                        break;
                    case 1:
                        intent = new Intent(context, Minecraft.class);
                        break;
                    case 2:
                        intent = new Intent(context, GtaV.class);
                        break;
                    case 3:
                        intent = new Intent(context, WiiSports.class);
                        break;
                    case 4:
                        intent = new Intent(context, Pubg.class);
                        break;
                    case 5:
                        intent = new Intent(context, Pokemon.class);
                        break;
                    case 6:
                        intent = new Intent(context, SuperMario.class);
                        break;
                    case 7:
                        intent = new Intent(context, MarioKart.class);
                        break;
                    case 8:
                        intent = new Intent(context, WiiSportR.class);
                        break;
                    case 9:
                        intent = new Intent(context, Diablo.class);
                        break;
                    default:
                        intent = new Intent(context, Home.class);
                }
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return (listGame == null) ? 0 : listGame.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        RelativeLayout parent;

        int position = getAdapterPosition();

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            parent = itemView.findViewById(R.id.activity_main);
        }
    }





}
