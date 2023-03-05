package com.example.dagggerlecture.car;

import com.example.dagggerlecture.MainActivity;

import dagger.Component;

@Component (modules = {WheelsModule.class})
public interface CarComponent {

    Car getCar();
    void inject(MainActivity mainActivity);
}
