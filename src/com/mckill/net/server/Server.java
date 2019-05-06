package com.mckill.net.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import com.mckill.net.Event;
import com.mckill.net.server.cardgroup.Cards;

public class Server {
	private ServerSocket socket;
	private InetSocketAddress ip;

	private Cards cards;

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
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			Object o = in.readObject();
			if (o instanceof Event) {
				Event e = (Event) o;
				switch (e.e) {
				case requsetId:

					break;
				case sendCard:

					break;
				case newPerson:

					break;
				case sendmessage:

					break;
				default:
					break;
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
