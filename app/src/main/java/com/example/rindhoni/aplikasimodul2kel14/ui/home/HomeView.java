package com.example.rindhoni.aplikasimodul2kel14.ui.home;

import com.example.rindhoni.aplikasimodul2kel14.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);

}
