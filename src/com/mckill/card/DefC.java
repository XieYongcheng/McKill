package com.mckill.card;

public class DefC extends Card implements DefenseAble {
	private static final long serialVersionUID = 434924928691678406L;
	private int num;

	public DefC(int cardId, String name) {
		super(cardId, name);
	}

	public DefC(int cardId, String name, int num) {
		super(cardId, name);
		this.num = num;
	}

	/**
	 * @see com.mckill.card.DefenseAble#canDefense(com.mckill.card.Card)
	 */
	@Override
	public boolean canDefense(Card c) {
		boolean has = false;
		if (c instanceof AttC) {
			AttC a = (AttC) c;
			for (Card i : a.getDefs()) {
				if (i.equals(c)) {
					has = true;
				}
			}
		}
		return has;
	}

	/**
	 * @see com.mckill.card.DefenseAble#Defense(com.mckill.card.Card, int)
	 */
	@Override
	public int Defense(Card c, int num) {
		//TODO
		return num;
	}

	@Override
	public String toString() {
		return "DefCard." + cardId + "(name:" + name + ", num=" + num + ")";
	}

}
