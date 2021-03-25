package com.log.week2.adapter.sockets;

import com.log.week2.adapter.connectors.EUPlugConnector;

public class EUSocket {

    public void plugIn(EUPlugConnector connector) {
        connector.provideElectricity();
    }

}
