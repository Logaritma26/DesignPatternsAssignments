package com.log;

import com.log.week1.factory.Plane;
import com.log.week1.factory.PlaneFactory;
import com.log.week1.factory.Type;
import com.log.week1.singleton.Singleton;
import com.log.week2.adapter.EUToUSPlugAdapter;
import com.log.week2.adapter.connectors.EUPlugConnector;
import com.log.week2.adapter.connectors.USPlugConnector;
import com.log.week2.adapter.sockets.EUSocket;
import com.log.week2.adapter.sockets.USSocket;
import com.log.week2.facade.MovieTheater;
import com.log.week3.iterator.OrderCollection;
import com.log.week3.iterator.OrderLister;
import com.log.week3.template.OrderTemplate1;
import com.log.week3.template.OrderTemplate2;
import com.log.week3.template.TicketProcessTemplate;

public class Main {

    public static void main(String[] args) {

        //singletonPattern();
        //factoryPattern();
        //adapterPattern();
        //facadePattern();

        //iteratorPattern();
        //templatePattern();
    }


    public static void singletonPattern(){
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.foo);
        singleton1.foo = "Another variable";

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.foo);
    }

    public static void factoryPattern(){
        PlaneFactory planeFactory = new PlaneFactory();

        Plane plane1 = planeFactory.createPlane(Type.SMALL);
        System.out.println(plane1.getMPH());

        Plane plane2 = planeFactory.createPlane(Type.MID);
        System.out.println(plane2.getMPH());

        Plane plane3 = planeFactory.createPlane(Type.BIG);
        System.out.println(plane3.getMPH());
    }

    public static void adapterPattern(){
        EUSocket euSocket = new EUSocket();
        USSocket usSocket = new USSocket();

        EUPlugConnector euPlugConnector = new EUPlugConnector() {
            @Override
            public void provideElectricity() {
                System.out.println("Providing electricity . . .");
            }
        };

        USPlugConnector usPlugConnector = new USPlugConnector() {
            @Override
            public void giveElectricity() {
                System.out.println("Giving electricity . . .");
            }
        };

        USPlugConnector adapter = new EUToUSPlugAdapter(euPlugConnector);

        euSocket.plugIn(euPlugConnector);
        usSocket.plugIn(usPlugConnector);

        usSocket.plugIn(adapter);
    }

    public static void facadePattern(){
        MovieTheater movieTheater = new MovieTheater();
        movieTheater.startMovie();
    }

    public static void iteratorPattern(){

        OrderCollection orderCollection = new OrderCollection();
        orderCollection.addItem("first order");
        orderCollection.addItem("second order");
        orderCollection.addItem("third order");


        OrderLister orderLister = new OrderLister(orderCollection);
        orderLister.printMyOrders();
    }

    public static void templatePattern(){

        TicketProcessTemplate order1 = new OrderTemplate1();
        order1.processOrder();
        System.out.println();

        TicketProcessTemplate order2 = new OrderTemplate2();
        order2.processOrder();
        System.out.println();
    }

}
