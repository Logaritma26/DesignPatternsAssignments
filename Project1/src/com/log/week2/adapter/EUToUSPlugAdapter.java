package com.log.week2.adapter;

import com.log.week2.adapter.connectors.EUPlugConnector;
import com.log.week2.adapter.connectors.USPlugConnector;
import com.log.week2.adapter.sockets.EUSocket;

public class EUToUSPlugAdapter implements USPlugConnector {

    private EUPlugConnector connector;

    public EUToUSPlugAdapter(EUPlugConnector connector) {
        this.connector = connector;
    }

    @Override
    public void giveElectricity() {
        connector.provideElectricity();
    }

}
