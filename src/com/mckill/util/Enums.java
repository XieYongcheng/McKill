package com.mckill.util;

import java.util.ArrayList;

public class Enums<T> {
	public ArrayList<T> tags;

	public Enums() {
		tags = new ArrayList<T>();
	}

	public void add(T a) {
		tags.add(a);
	}

	public void remove(T a) {
		try {
			tags.remove(a);
		} catch (Exception e) {
		}
	}

	public boolean has(T a) {
		boolean r = false;
		for (T i : tags) {
			if (a.equals(i)) {
				r = true;
			}
		}
		return r;
	}
}
