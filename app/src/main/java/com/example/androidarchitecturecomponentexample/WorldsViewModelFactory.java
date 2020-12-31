package com.example.androidarchitecturecomponentexample;


import android.app.Application;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class WorldsViewModelFactory implements ViewModelProvider.Factory {
    private Application mApplication;
    private String mParam;


    public WorldsViewModelFactory(Application application) {
        mApplication = application;
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new WordViewModel(mApplication);
    }
}
