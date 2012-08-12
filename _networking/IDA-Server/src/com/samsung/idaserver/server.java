package com.samsung.idaserver;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Server;
import com.esotericsoftware.minlog.Log;

import java.io.IOException;


public class server {
    private Server server;

    public server() throws IOException {
        server = new Server();
        registerPackets();
        server.start();
        server.addListener(new networkListener());
        server.bind(5555);
    }

    private void registerPackets() {
        Kryo kryo = server.getKryo();
        kryo.register(packet.PacketLoginRequest.class);
        kryo.register(packet.PacketLoginAnswer.class);
        kryo.register(packet.PacketMessage.class);
    }

    public static void main(String[] args) {
        try {
            new server();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            Log.info("[SERVER] Can't start server");
        }
        Log.set(Log.LEVEL_DEBUG);
    }
}
