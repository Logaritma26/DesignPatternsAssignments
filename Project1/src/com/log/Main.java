package com.log;

import com.log.week2.adapter.EUToUSPlugAdapter;
import com.log.week2.adapter.connectors.EUPlugConnector;
import com.log.week2.adapter.connectors.USPlugConnector;
import com.log.week2.adapter.sockets.EUSocket;
import com.log.week2.adapter.sockets.USSocket;
import com.log.week2.facade.MovieTheater;

public class Main {

    public static void main(String[] args) {

        /*
        // facade

        MovieTheater movieTheater = new MovieTheater();
        movieTheater.startMovie();
        */



/*

        // adapter

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
*/


    }
}
