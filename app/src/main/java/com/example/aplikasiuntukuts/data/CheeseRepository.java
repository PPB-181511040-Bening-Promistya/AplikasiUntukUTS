package com.example.aplikasiuntukuts.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class CheeseRepository {
    private CheeseDao cheeseDao;
    private LiveData<List<Cheese>> AllCheeses;

    public CheeseRepository(Application app){
        SampleDatabase db = SampleDatabase.getInstance(app);
        cheeseDao = db.cheese();
        AllCheeses = cheeseDao.getAllCheeses();
    }

    LiveData<List<Cheese>> getAllCheeses(){
        return AllCheeses;
    }
}