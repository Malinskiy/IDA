package com.samsung.idaserver;

public class packet {
    public static class PacketLoginRequest {
    }

    public static class PacketLoginAnswer {
        boolean answer = false;
    }

    public static class PacketMessage {
        String msg;
    }
}
