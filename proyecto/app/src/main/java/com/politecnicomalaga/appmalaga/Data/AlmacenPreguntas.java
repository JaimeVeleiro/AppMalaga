package com.politecnicomalaga.appmalaga.Data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AlmacenPreguntas {
    private Pregunta[] alm;

    public AlmacenPreguntas() {
    }

    //String sFichero = "preguntas";

    //String json = ControladorFicheros.readText(sFichero + ".json");
    //Gson gson1 = new Gson();

    public Pregunta[] getAlm() {
        return alm;
    }
}
