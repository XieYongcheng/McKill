package com.mckill.person;

import java.util.ArrayList;

import com.mckill.card.BuffC;
import com.mckill.card.Card;

public class Person {
	private int UId;
	private String name;

	private int hp;
	private int att;

	private ArrayList<Card> cards;
	private ArrayList<BuffC> buffs;
	private BuffC weapon;

	private void Attack(Person p) {

	}

	private void Defence(Person p) {

	}

	private void DoBuff() {
		for (BuffC i : buffs) {
			switch (i.getMode()) {
			case hp:

				break;
			case fire:

				break;
			default:
				// nothing to do
				break;
			}
		}
	}

	private int GetMoreCards() {
		int r = 0;
		for (BuffC i : buffs) {
			switch (i.getSmode()) {
			case moreCard:
				++r;
				break;
			default:
				// nothing to do
				break;
			}
		}
		return r;
	}

	private void AddCards(ArrayList<Card> cards) {
		for (Card card : cards) {
			this.cards.add(null);
		}
	}

	private void Turn() {
		DoBuff();

	}
}
