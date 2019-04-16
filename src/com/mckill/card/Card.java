package com.mckill.card;

import java.io.Serializable;

public class Card implements Serializable {
	private static final long serialVersionUID = 3146973623573843789L;
	public String name;
	public int cardId;

	public Card() {
	}

	public Card(int cardId) {
		this.cardId = cardId;
	}

	public Card(int cardId, String name) {
		this.cardId = cardId;
		this.name = name;
	}

	public int getCardId() {
		return cardId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Card)) {
			return false;
		}
		Card other = (Card) obj;
		if (cardId != other.cardId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Card." + cardId;
	}
}
