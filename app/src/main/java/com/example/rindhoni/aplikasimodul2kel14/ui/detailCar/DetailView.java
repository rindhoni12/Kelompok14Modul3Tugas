package com.example.rindhoni.aplikasimodul2kel14.ui.detailCar;

import com.example.rindhoni.aplikasimodul2kel14.data.model.DataCar;

import java.util.List;

public interface DetailView {
    void showErrorCarById(String message);

    void showSuccessCarById(List<DataCar> dataCar);
}