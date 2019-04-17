package com.mckill.net.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket socket;
	private InetSocketAddress ip;

	public static void main(String[] args) {
		Server a = new Server();
		a.run();
	}

	public void run() {
		try {
			socket = new ServerSocket();
			ip = new InetSocketAddress("127.0.0.1", 2048);
			socket.bind(ip);
			while (socket.isBound()) {
				Socket client = socket.accept();
				session(client);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void session(Socket socket) {
		try {
			Scanner in;
			in = new Scanner(socket.getInputStream());
			System.out.println(in.nextLine());
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
