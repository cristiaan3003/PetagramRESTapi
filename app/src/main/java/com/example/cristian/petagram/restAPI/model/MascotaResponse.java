package com.example.cristian.petagram.restAPI.model;

import com.example.cristian.petagram.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Nelson Abreu on 6/26/2016.
 */
public class MascotaResponse {
    ArrayList<Mascota> mascotas;

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
