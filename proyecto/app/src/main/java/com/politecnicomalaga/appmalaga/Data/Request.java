package com.politecnicomalaga.appmalaga.Data;

import com.google.gson.Gson;
import com.politecnicomalaga.appmalaga.Control.PreguntasViewModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Request {
    private boolean error;
    private List<Pregunta> listData;
    private PreguntasViewModel vmInstance;

    public Request(PreguntasViewModel vmInstance) {
        error = false;
        this.vmInstance = vmInstance;
        listData = new ArrayList<>();
    }

    public void getData() {
        //Reseteamos el modo error para que no se guarden "errores" previos
        error = false;

    }

    public void setData(String json) {
        //Si estamos en modo error, no hacemos nada
        if (error) return;

        //Procesar el JSON para pasarlo a objetos del modelo, una lista de películas o series
        Gson gson = new Gson();
        //MovieResultSet result = gson.fromJson(json, MovieResultSet.class);

        //del MovieResultSet nos interesa por ahora la lista de pelis/series
        //listData = Arrays.asList(result.getResults());

        //Notificamos al viewmodel
        this.vmInstance.setData();
    }

    public void activateError() {
        error = true;
    }

    public boolean isError() {
        return error;
    }

    public List<Pregunta> getListData() {
        return listData;
    }
}
