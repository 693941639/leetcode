package leetcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingDeque;

public class ChatServer {
    public final static int SERVER_PORT = 55535;

    private Socket server;

    private LinkedBlockingDeque<String> queue;

    public ChatServer() {
        try (
            ServerSocket server = new ServerSocket(SERVER_PORT);
        ) {
            this.server = server.accept();
            this.server.getInputStream();
            this.queue = new LinkedBlockingDeque<String>();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Run() {
        Thread read = new Thread(() -> {

        });
    }
}
