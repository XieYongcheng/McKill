package com.mckill.card;

import com.mckill.card.BuffC.Mode;
import com.mckill.card.BuffC.SMode;

public interface BuffAble {

	/**
	 * @return if return true means it's dead
	 */
	boolean used();

	Mode getMode();

	SMode getSmode();

	int getNum();

	int getTimes();

}