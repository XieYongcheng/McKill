package com.mckill.card;

import java.util.ArrayList;

public interface AttackAble {

	// 获取攻击数值 传递人物力量
	int getNum(int person_str);

	// 获取可用于防御的卡
	ArrayList<Card> getDefs();

	// 返回is_to_all
	boolean isIs_to_all();

}