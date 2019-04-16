package com.mckill.card;

public class BowC extends Card {
	private static final long serialVersionUID = 3666214582688193888L;
	int num;

	public BowC(int cardId, String name) {
		super(cardId, name);
	}

	public BowC(int cardId, String name, int num) {
		super(cardId, name);
		this.num = num;
	}

	@Override
	public String toString() {
		return "BowCard." + cardId + "(name:" + name + ", num:" + num + ")";
	}

}
