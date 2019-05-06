package com.mckill.test;

import org.junit.Test;

import com.mckill.card.AttC;
import com.mckill.card.BuffAble;
import com.mckill.card.BuffC;
import com.mckill.card.BuffC.Mode;
import com.mckill.net.server.cardgroup.CardGroup;
import com.mckill.card.Card;
import com.mckill.util.Enums;

public class MyTest {
	@Test
	public void test() throws Exception {
		Card c = new AttC(1, "att", 2, new Card(1));
		if (c instanceof BuffC) {
			BuffAble c1 = (BuffAble) c;
			c1.used();
		}
		System.out.println(c);
	}

	@Test
	public void test2() throws Exception {
		CardGroup g = new CardGroup();
		System.out.println(g);
	}

	@Test
	public void EnumsTest() throws Exception {
		Enums<Mode> modes = new Enums<BuffC.Mode>();
		modes.add(Mode.att);
		modes.add(Mode.def);
		System.out.println(modes.has(Mode.att));
		System.out.println(modes.has(Mode.hp));
	}
}
