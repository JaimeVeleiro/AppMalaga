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
            loadData();
        }
        return listaResultados;
    }

    public void loadData() {
        // Do an asynchronous operation to fetch data.
        myRequest = new Request(this);
        myRequest.getData();
        this.setData();
    }

    public void setData() {
        listaResultados.postValue(myRequest.getListData());
    }
}
