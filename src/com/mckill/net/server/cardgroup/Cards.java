package com.mckill.net.server.cardgroup;

import java.util.ArrayList;

import com.mckill.card.AttC;
import com.mckill.card.Card;
import com.mckill.card.DefC;

public class Cards {
	public final static ArrayList<Card> Cards;
	static {
		Cards = new ArrayList<Card>();
		Cards.add(new DefC(0, "def"));
		Cards.add(new AttC(1, "att1", 1));
		Cards.add(new AttC(2, "att10", 10));
		Cards.add(new AttC(3, "att2", 2));
		Cards.add(new AttC(4, "att3", 3));
	}

	public static Card get(int Id) {
		// TODO : no supper
		return Cards.get(Id);
	}
}
