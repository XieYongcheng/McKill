package com.mckill.cardgroup;

import java.util.ArrayList;
import java.util.Random;

import com.mckill.card.Card;

public class CardGroup {
	private ArrayList<Card> cards;
	private int index;

	public CardGroup() {
		cards = Cards.Cards;
		reset();
	}

	public Card get() {
		if (index + 1 < cards.size())
			return cards.get(index++);
		else {
			// TODO ºÍÅÆ
			reset();
			return get();
		}
	}

	public ArrayList<Card> get(int num) {
		ArrayList<Card> r = new ArrayList<Card>();
		for (int i = 0; i < num; i++) {
			r.add(get());
		}
		return r;
	}

	private void reset() {
		index = 0;
		random();
	}

	private void random() {
		ArrayList<Card> temp = new ArrayList<Card>();
		int size = cards.size();
		Random r = new Random();
		while (size != 0) {
			int t = r.nextInt(size--);
			temp.add(cards.get(t));
			cards.remove(t);
		}
		cards = temp;
	}

	@Override
	public String toString() {
		return "CardGroup." + index + " [" + cards + "]";
	}

}
