package com.matscode.miscontactos.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.matscode.miscontactos.R;
import com.matscode.miscontactos.pojo.Mascota;

import java.util.ArrayList;

public class FotosAdaptador extends RecyclerView.Adapter<FotosAdaptador.FotosViewHolder>{
    ArrayList<Mascota> mascotas;
    Activity activity;

    public FotosAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public FotosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_fotos, parent, false);
        return new FotosViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FotosViewHolder fotosViewHolder, int position) {
        Mascota mascota = mascotas.get(position);
        fotosViewHolder.imgFoto.setImageResource(mascota.getFoto());
        fotosViewHolder.Rating.setText(mascota.getRating());
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class FotosViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private TextView Rating;
        public FotosViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFotosFoto);
            Rating = (TextView) itemView.findViewById(R.id.tvFotosRat);
        }
    }
}
