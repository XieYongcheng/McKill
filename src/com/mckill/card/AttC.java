package com.mckill.card;

import java.util.ArrayList;

import com.mckill.net.server.cardgroup.Cards;

public class AttC extends Card implements AttackAble {
	private static final long serialVersionUID = -3801760299331637092L;
	private int num; // 数值 一般存放攻击数值
	private ArrayList<Card> defs; // 可用于防御的卡
	private boolean is_to_all; // 是否对全部玩家造成攻击

	// 构造 
	public AttC(int cardId, String name, int num, ArrayList<Card> defs, boolean is_to_all) {
		super(cardId, name);
		this.num = num;
		this.defs = defs;
		this.is_to_all = is_to_all;
	}

	// 构造 
	public AttC(int cardId, String name, int num, ArrayList<Card> defs) {
		super(cardId, name);
		this.num = num;
		this.defs = defs;
		this.is_to_all = false;
	}

	// 构造 
	public AttC(int cardId, String name, int num, Card def, boolean is_to_all) {
		super(cardId, name);
		this.num = num;
		this.defs = new ArrayList<Card>();
		this.defs.add(def);
		this.is_to_all = is_to_all;
	}

	// 构造 
	public AttC(int cardId, String name, int num, Card def) {
		super(cardId, name);
		this.num = num;
		this.defs = new ArrayList<Card>();
		this.defs.add(def);
		this.is_to_all = false;
	}

	// 构造 
	public AttC(int cardId, String name, int num) {
		super(cardId, name);
		this.num = num;
		this.defs = new ArrayList<Card>();
		this.defs.add(Cards.get(0));
		this.is_to_all = false;
	}

	// 构造 
	public AttC(int cardId, int num, ArrayList<Card> defs, boolean is_to_all) {
		super(cardId);
		this.num = num;
		this.defs = defs;
		this.is_to_all = is_to_all;
	}

	/**
	 * @see com.mckill.card.AttackAble#getNum()
	 */
	@Override
	public int getNum(int att) {
		//TODO: do something here
		return num;
	}

	/**
	 * @see com.mckill.card.AttackAble#getDefs()
	 */
	@Override
	public ArrayList<Card> getDefs() {
		return defs;
	}

	/**
	 * @see com.mckill.card.AttackAble#isIs_to_all()
	 */
	@Override
	public boolean isIs_to_all() {
		return is_to_all;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((defs == null) ? 0 : defs.hashCode());
		result = prime * result + (is_to_all ? 1231 : 1237);
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof AttC)) {
			return false;
		}
		AttC other = (AttC) obj;
		if (defs == null) {
			if (other.defs != null) {
				return false;
			}
		} else if (!defs.equals(other.defs)) {
			return false;
		}
		if (is_to_all != other.is_to_all) {
			return false;
		}
		if (num != other.num) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		String r = "AttCard." + cardId + "(name=" + name + ", cardId=" + cardId + ", defs=" + defs;
		if (is_to_all) {
			r += " is_to_all";
		}
		r += ")";
		return r;
	}

}
