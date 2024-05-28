package com.politecnicomalaga.appmalaga.Control;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.politecnicomalaga.appmalaga.Data.Pregunta;
import com.politecnicomalaga.appmalaga.Data.Request;

import java.util.List;

public class PreguntasViewModel extends ViewModel {

    private MutableLiveData<List<Pregunta>> listaResultados;

    private Request myRequest;
    public LiveData<List<Pregunta>> getResults() {
        if (listaResultados == null) {
            listaResultados = new MutableLiveData<List<Pregunta>>();
            loadData(Request.idioma.ESP);
        }
        return listaResultados;
    }

    public void loadData(Request.idioma idioma) {

        myRequest = new Request(this);
        myRequest.getData(idioma);
        this.setData();
    }

    public void setData() {
        listaResultados.postValue(myRequest.getListData());
    }
}
