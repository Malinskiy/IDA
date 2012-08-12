package com.samsung.idaserver;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.minlog.Log;
import com.sun.xml.internal.ws.api.message.Packet;

public class networkListener extends Listener {
    public void connected(Connection arg) {
        Log.info("[SERVER] Client connected");
    }

    public void disconnected(Connection arg) {
        Log.info("[SERVER] Client disconnected");
    }

    public void received(Connection con, Object obj) {
        if( obj instanceof packet.PacketLoginRequest){
            System.out.print("Sending PacketLoginAnswer");
            packet.PacketLoginAnswer loginAnswer = new packet.PacketLoginAnswer();
            loginAnswer.answer = true;
            con.sendTCP(loginAnswer);
        }
        if( obj instanceof packet.PacketMessage) {
            String message = ((packet.PacketMessage) obj).msg;
            Log.info("Got message: "+message);
        }
    }

}
