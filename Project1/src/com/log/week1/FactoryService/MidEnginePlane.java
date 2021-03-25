package com.log.week1.FactoryService;

public class MidEnginePlane implements Plane{

    private final int mph = 500;

    @Override
    public int getMPH() {
        return mph;
    }

}
