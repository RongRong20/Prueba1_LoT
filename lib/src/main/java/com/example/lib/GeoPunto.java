package com.example.lib;

public class GeoPunto(double longitud, double latitud) {
        this.longitud = (int) (longitud * 1E6);
        this.latitud = (int) (latitud * 1E6);
}
