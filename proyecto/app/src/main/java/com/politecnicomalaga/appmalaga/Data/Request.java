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

    public enum idioma {
        ESP,
        ING
    }

    public Request(PreguntasViewModel vmInstance) {
        error = false;
        this.vmInstance = vmInstance;
        listData = new ArrayList<>();
    }

    public void getData(idioma tipo) {
        error = false;
        String data = "";

        if (tipo == idioma.ESP) {
            data = ControladorFicheros.readText("preguntas.json");
        } else if (tipo == idioma.ING) {
            data = ControladorFicheros.readText("preguntasIngles.json");
        }
        setData(data);
    }

    public void setData(String data) {
        if (error) return;

        Gson gson = new Gson();
        AlmacenPreguntas almP = gson.fromJson(data, AlmacenPreguntas.class);

        listData = Arrays.asList(almP.getAlm());

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
