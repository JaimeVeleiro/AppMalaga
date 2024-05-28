package com.politecnicomalaga.appmalaga.Data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class AlmacenPreguntas {
    private ArrayList alm;

    public AlmacenPreguntas(ArrayList alm) {
        alm = gson1.fromJson(json, new TypeToken<ArrayList<Pregunta>>() {}.getType());
    }

    String sFichero = "preguntas";

    String json = ControladorFicheros.readText(sFichero + ".json");
    Gson gson1 = new Gson();

    public ArrayList getAlm() {
        return alm;
    }
}
