package com.log.week1.FactoryService;

public class BigEnginePlane implements Plane{

    private final int mph = 1000;

    @Override
    public int getMPH() {
        return mph;
    }
}
