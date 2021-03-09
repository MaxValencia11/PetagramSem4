package com.matscode.miscontactos;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.matscode.miscontactos.adapter.FotosAdaptador;
import com.matscode.miscontactos.adapter.MascotaAdaptador;
import com.matscode.miscontactos.pojo.Mascota;

import java.util.ArrayList;


public class PerfilFragment extends Fragment {
    private RecyclerView listaFotos;
    ArrayList<Mascota> mascotas;
    TextView nombrePerfil;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_perfil, container, false);
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaFotos = (RecyclerView) v.findViewById(R.id.rvFotos);
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);
        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.VERTICAL);

        nombrePerfil = v.findViewById(R.id.tvFotosNombre);

        nombrePerfil.setText("Pee Oww");

        listaFotos.setLayoutManager(glm);
        inicializarListaContactos();
        inicializarAdaptador();
        return v;
    }

    public FotosAdaptador adaptadorF;
    private void inicializarAdaptador(){
        adaptadorF = new FotosAdaptador(mascotas, getActivity());
        listaFotos.setAdapter(adaptadorF);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.ic_chicken, "Pee Oww", "5"));
        mascotas.add(new Mascota(R.drawable.ic_chicken, "Pee Oww", "0"));
        mascotas.add(new Mascota(R.drawable.ic_chicken, "Pee Oww", "4"));
        mascotas.add(new Mascota(R.drawable.ic_chicken, "Pee Oww", "2"));
        mascotas.add(new Mascota(R.drawable.ic_chicken, "Pee Oww", "1"));
        mascotas.add(new Mascota(R.drawable.ic_chicken, "Pee Oww", "0"));
        mascotas.add(new Mascota(R.drawable.ic_chicken, "Pee Oww", "5"));
        mascotas.add(new Mascota(R.drawable.ic_chicken, "Pee Oww", "4"));
    }
}