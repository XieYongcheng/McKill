package com.mckill.net.client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	Socket socket;
	Scanner in;
	PrintStream out;

	public static void main(String[] args) {
		Client a = new Client();
		a.connect();
	}

	public void connect() {
		try {
			socket = new Socket("127.0.0.1", 2048);
			in = new Scanner(socket.getInputStream());
			out = new PrintStream(socket.getOutputStream());
			out.println("hi");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
