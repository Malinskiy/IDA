package com.samsung.idajavaclient;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.minlog.Log;

public class networkListener extends Listener {
    static private Client client;

    public void init(Client client) {
        this.client = client;
    }

    public void connected(Connection arg) {
        packet.PacketLoginRequest estCon = new packet.PacketLoginRequest();
        client.sendTCP(estCon);
        Log.info("[CLIENT] Connection established");
    }

    public void disconnected(Connection arg) {
        Log.info("[CLIENT] Disconnected");
    }

    public void received(Connection con, Object obj) {
        if( obj instanceof packet.PacketLoginAnswer){
            boolean answ = ((packet.PacketLoginAnswer) obj).answer;
            if(answ)
            {
                Log.info("Enter another message");
            }
            else
            {
                con.close();
            }
        }
    }
}
