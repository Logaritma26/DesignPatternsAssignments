package com.log.FactoryService;

public class SmallEnginePlane implements Plane{

    private final int mph = 300;

    @Override
    public int getMPH() {
        return mph;
    }

}
