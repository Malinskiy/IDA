package com.samsung.idajavaclient;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.minlog.Log;

import java.io.IOException;
import java.util.Scanner;


public class idaClient {
    public static Client client;
    public static Scanner scanner;

    public idaClient() {
        scanner = new Scanner(System.in);
        client = new Client();
        registerPackets();
        networkListener nl = new networkListener();
        nl.init(client);
        client.addListener(nl);
        client.start();

        try {
            Log.info("Enter IP\n");
            client.connect(60000,scanner.nextLine(), 5555);
            client.connect(100000,"127.0.0.1", 5555);
        } catch (IOException e) {
            e.printStackTrace();
            client.stop();
        }
    }

    private void registerPackets() {
        Kryo kryo = client.getKryo();
        kryo.register(packet.PacketLoginRequest.class);
        kryo.register(packet.PacketLoginAnswer.class);
        kryo.register(packet.PacketMessage.class);
    }

    public static void main(String[] args) {
        new idaClient();
        Log.set(Log.LEVEL_DEBUG);
        while(client.isConnected()) {
            if(idaClient.scanner.hasNext() ) {
                packet.PacketMessage npacket = new packet.PacketMessage();
                npacket.msg = idaClient.scanner.nextLine();
                client.sendTCP(npacket);
                Log.info("Enter another message");
            }
        }
    }
}
