package com.politecnicomalaga.appmalaga.Data;

import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;
import com.politecnicomalaga.appmalaga.Control.PreguntasViewModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Request {
    private List<Pregunta> listData;
    private PreguntasViewModel vmInstance;

    public enum idioma {
        ESP,
        ING
    }

    public Request(PreguntasViewModel vmInstance) {
        this.vmInstance = vmInstance;
        listData = new ArrayList<>();
    }

    public void getData(idioma tipo) {
        String data = "";

        if (tipo == idioma.ESP) {
            data = "{" +
                    "\"alm\": [" +
                    "{" +
                    "\"sPregunta\": \"¿En qué siglo experimentó Málaga un auge industrial significativo?\"," +
                    "\"sImagen\": \"https://www.juntadeandalucia.es/institutodeestadisticaycartografia/atlashistoriaecon/cap_39/Industria_Malaga_sXIX.jpg\"," +
                    "\"alRespuestas\": [" +
                    "\"Siglo XVIII\"," +
                    "\"Siglo XIX\"," +
                    "\"Siglo XX\"," +
                    "\"Siglo XXI\"" +
                    "],\n" +
                    "\"sRespuestaCorrecta\": \"Siglo XIX\"" +
                    "}," +
                    "{" +
                    "\"sPregunta\": \"¿Qué producto era famoso por fabricarse en la fábrica de chocolate malagueña 'La Riojana'?\"," +
                    "\"sImagen\": \"https://s2.ppllstatics.com/diariosur/www/multimedia/202003/05/media/cortadas/1920%20-Fachada%20de%20la%20tienda%20de%20La%20Riojana%20de%20la%20calle%20Larios.%20Archivo%20Municipal%20de%20M%C3%A1laga-kSLB-U100414994223knE-624x385@Diario%20Sur.jpg\"," +
                    "\"alRespuestas\": [" +
                    "\"Vino\"," +
                    "\"Aceite\"," +
                    "\"Chocolate\"," +
                    "\"Papel\"" +
                    "]," +
                    "\"sRespuestaCorrecta\": \"Chocolate\"" +
                    "}" +
                    "]" +
                    "}";
        } else if (tipo == idioma.ING) {
            data = ControladorFicheros.readText("preguntasIngles.json");
        }
        setData(data);

    }

    public void setData(String data) {

        Gson gson = new Gson();
        AlmacenPreguntas almP = gson.fromJson(data, AlmacenPreguntas.class);

        listData = Arrays.asList(almP.getAlm());

        this.vmInstance.setData();

    }

    public List<Pregunta> getListData() {
        return listData;
    }
}
