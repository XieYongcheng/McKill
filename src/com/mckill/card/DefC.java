package com.mckill.card;

public class DefC extends Card {
	private static final long serialVersionUID = 434924928691678406L;
	private int num;

	public DefC(int cardId, String name) {
		super(cardId, name);
	}

	public DefC(int cardId, String name, int num) {
		super(cardId, name);
		this.num = num;
	}

	@Override
	public String toString() {
		return "DefCard." + cardId + "(name:" + name + ", num=" + num + ")";
	}

}
