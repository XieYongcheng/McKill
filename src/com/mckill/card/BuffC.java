package com.mckill.card;

public class BuffC extends Card implements BuffAble {
	private static final long serialVersionUID = -1079944975329702927L;

	public enum Mode {
		hp, att, attper, def, defper, fire,
	}
	// hp: 中毒, 回血
	// att: 攻击增(减)益
	// attper: 攻击增(减)益 %
	// def: 防御增(减)益
	// defper: 防御增(减)益 %
	// fire: 点燃

	public enum SMode {
		skip, moreCard,
	}

	private Mode mode;
	private SMode smode;
	private int num;
	private int times;

	public BuffC() {
	}

	public BuffC(int cardId, String name, Mode mode, SMode smode, int num, int times) {
		super(cardId, name);
		this.mode = mode;
		this.smode = smode;
		this.num = num;
		this.times = times;
	}

	public BuffC(int cardId, String name, Mode mode, int num, int times) {
		super(cardId, name);
		this.mode = mode;
		this.smode = null;
		this.num = num;
		this.times = times;
	}

	public BuffC(int cardId, Mode mode, int num, int times) {
		super(cardId);
		this.mode = mode;
		this.smode = null;
		this.num = num;
		this.times = times;
	}

	/**
	 * @see com.mckill.card.BuffAble#used()
	 */
	@Override
	public boolean used() {
		return --times < 0;
	}

	/**
	 * @see com.mckill.card.BuffAble#getMode()
	 */
	@Override
	public Mode getMode() {
		return mode;
	}

	/**
	 * @see com.mckill.card.BuffAble#getSmode()
	 */
	@Override
	public SMode getSmode() {
		return smode;
	}

	/**
	 * @see com.mckill.card.BuffAble#getNum()
	 */
	@Override
	public int getNum() {
		return num;
	}

	/**
	 * @see com.mckill.card.BuffAble#getTimes()
	 */
	@Override
	public int getTimes() {
		return times;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mode == null) ? 0 : mode.hashCode());
		result = prime * result + num;
		result = prime * result + ((smode == null) ? 0 : smode.hashCode());
		result = prime * result + times;
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
		if (!(obj instanceof BuffC)) {
			return false;
		}
		BuffC other = (BuffC) obj;
		if (mode != other.mode) {
			return false;
		}
		if (num != other.num) {
			return false;
		}
		if (smode != other.smode) {
			return false;
		}
		if (times != other.times) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Card." + cardId + "(name:" + name + ", mode:" + mode + ", smode:" + smode + ", num:" + num + ", times:"
				+ times + ")";
	}

}
