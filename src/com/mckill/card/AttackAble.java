package com.mckill.card;

import java.util.ArrayList;

public interface AttackAble {

	// ��ȡ������ֵ ������������
	int getNum(int person_str);

	// ��ȡ�����ڷ����Ŀ�
	ArrayList<Card> getDefs();

	// ����is_to_all
	boolean isIs_to_all();

}