package com.mckill.person;

import java.util.ArrayList;

import com.mckill.card.BuffC;
import com.mckill.card.Card;
import com.mckill.game.ui.IUI;
import com.mckill.net.client.Client;

public class Person {
	private int UId;
	private String name;

	private int hp;
	private int att;

	private ArrayList<Card> cards;
	private ArrayList<BuffC> buffs;
	private BuffC weapon;

	private IUI ui;

	private Client client;

	/**
	 * 
	 * @param c
	 * @param p
	 */
	private void Attack(Card c, Person p) {

	}

	private void Defence(Card c, Person p) {

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
	}// ִ��Ч��

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
			this.cards.add(card);
		}
	}

	// ��ǰ�غ�
	public void Turn() {
		// ��鲢ִ��buff
		DoBuff();
		// ����
		int cards_num = 2;
		client.getCards(cards_num);
		ui.doTurn();
		// �����غ�
	}

}
