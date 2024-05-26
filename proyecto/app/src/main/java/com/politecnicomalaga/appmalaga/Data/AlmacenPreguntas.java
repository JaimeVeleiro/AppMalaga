package com.politecnicomalaga.appmalaga.Data;

import java.util.ArrayList;

public class AlmacenPreguntas {
    private ArrayList alm;

    public AlmacenPreguntas(ArrayList alm) {
        alm = new ArrayList();
    }

    String sFichero = "preguntas";

    String json = ControladorFicheros.readText(sFichero + ".json");
    Gson gson1 = new Gson();
    alm = gson1.fromJson(json, new TypeToken<ArrayList<Pregunta>>() {}.getType());


}
