package com.log.week2.adapter.sockets;

import com.log.week2.adapter.connectors.USPlugConnector;

public class USSocket {

    public void plugIn(USPlugConnector connector) {
        connector.giveElectricity();
    }

}
