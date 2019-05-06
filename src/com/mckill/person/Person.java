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
	 * @param c attack card
	 * @param p defense person
	 */
	private void Attack(Card c, Person p) {
		// TODO
	}

	/**
	 * 
	 * @param c attack card
	 * @param p attack person
	 */
	private void Defense(Card c, Person p) {
		// TODO
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
	}// 执行效果

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

	// 当前回合
	public void Turn() {
		// 检查并执行buff
		DoBuff();
		// 摸牌
		int cards_num = 2;
		client.getCards(cards_num);
		ui.doTurn();
		// 结束回合
	}

}
