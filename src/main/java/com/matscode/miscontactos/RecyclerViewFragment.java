package com.matscode.miscontactos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.matscode.miscontactos.adapter.MascotaAdaptador;
import com.matscode.miscontactos.pojo.Mascota;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    private RecyclerView listaContactos;
    ArrayList<Mascota> mascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaContactos = (RecyclerView) v.findViewById(R.id.rvContactos);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        //GridLayoutManager glm = new GridLayoutManager(this, 2); Para ponerlo en Grid

        listaContactos.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();

        return v;
    }

    public MascotaAdaptador adaptador;
    private void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaContactos.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.ic_dog,"Dogo", "3"));
        mascotas.add(new Mascota(R.drawable.ic_cat, "Chami", "2"));
        mascotas.add(new Mascota(R.drawable.ic_chicken, "Pee Oww", "5"));
        mascotas.add(new Mascota(R.drawable.ic_owl,"Hedwig", "4"));
        mascotas.add(new Mascota(R.drawable.ic_dog2,"Chore", "4"));
        mascotas.add(new Mascota(R.drawable.ic_parrot,"Speaker", "3"));
    }
}
