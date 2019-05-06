package com.mckill.card;

public interface DefenseAble {

	/**
	 * check c(Card) can be defended
	 */
	boolean canDefense(Card c);

	/**
	 * 
	 * @param c   need to be defended (the attack card)
	 * @param num need defense times
	 * @return defense times(left)
	 */
	int Defense(Card c, int num);

}