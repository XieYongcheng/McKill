package com.mckill.net;

import java.io.Serializable;

import com.mckill.card.Card;

public class Event implements Serializable {
	private static final long serialVersionUID = 1738774122802684054L;

	public enum event {
		requsetId, sendCard, newPerson, sendmessage
	}

	public event e;
	public int num;
	public String str;
	public Card c;

	public Event() {
	}

	public Event(event e) {
		this.e = e;
	}

	public static Event GetRequstIdEvent() {
		Event e = new Event(event.requsetId);
		e.num = 0;
		return e;
	}

	public static Event GetSendIdEvent(int id) {
		Event e = new Event(event.requsetId);
		e.num = id;
		return e;
	}

	public static Event GetSendCardEvent(Card card) {
		Event e = new Event(event.sendCard);
		e.c = card;
		return e;
	}

	public static Event GetEvent() {
		return new Event();
	}
}
