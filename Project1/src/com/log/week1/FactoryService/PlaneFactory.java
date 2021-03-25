package com.log.week1.FactoryService;

public class PlaneFactory {

    public Plane createPlane(Type type) {
        switch (type){
            case SMALL:
                return new SmallEnginePlane();
            case MID:
                return new MidEnginePlane();
            case BIG:
                return new BigEnginePlane();
            default:
                break;
        }
        return null;
    }
}
