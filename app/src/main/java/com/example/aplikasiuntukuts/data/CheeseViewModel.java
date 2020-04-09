package com.example.aplikasiuntukuts.data;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class CheeseViewModel extends AndroidViewModel {
    private CheeseRepository cheeseRepository;
    private LiveData<List<Cheese>> AllCheeses;

    public CheeseViewModel (Application app){
        super(app);
        cheeseRepository = new CheeseRepository(app);
        AllCheeses = cheeseRepository.getAllCheeses();
    }

    public LiveData<List<Cheese>> getAllCheeses(){
        return AllCheeses;
    }
}