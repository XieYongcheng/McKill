package com.mckill.card;

public class BowC extends Card implements BowAble {
	private static final long serialVersionUID = 3666214582688193888L;
	int num;

	public BowC(int cardId, String name) {
		super(cardId, name);
	}

	public BowC(int cardId, String name, int num) {
		super(cardId, name);
		this.num = num;
	}

	/**
	 * @see com.mckill.card.BowAble#Attack(com.mckill.card.Card)
	 */
	@Override
	public int Attack(Card c) {
		//TODO:
		return num;
	}

	@Override
	public String toString() {
		return "BowCard." + cardId + "(name:" + name + ", num:" + num + ")";
	}

}
