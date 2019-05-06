package com.mckill.game;

import java.util.ArrayList;

import com.mckill.person.Person;

public class Game {

	ArrayList<Person> players;
	int index;

	public Game(ArrayList<Person> players, int index) {
		this.players = players;
		this.index = index;
	}

	public Game() {
		players = new ArrayList<>();
		index = 0;
	}

	public void run() {
		while (true) {
			Person i = players.get(index);
			i.Turn();
		}
	}

}
