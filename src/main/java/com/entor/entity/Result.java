package com.entor.entity;

import java.io.Serializable;

public class Result implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1682913789678096250L;
	private int statue;
	private String msg;
	public int getStatue() {
		return statue;
	}
	public void setStatue(int statue) {
		this.statue = statue;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
