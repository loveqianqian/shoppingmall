package com.zhiboer.mall.utils;

import java.util.ArrayList;

public class ResultWithPage {

	private String total;
	private ArrayList<Object> rows;
	private  ArrayList<Object> footer;
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public ArrayList<Object> getRows() {
		return rows;
	}

	public void setRows(ArrayList<Object> rows) {
		this.rows = rows;
	}

	public  ArrayList<Object> getFooter() {
		return footer;
	}

	public void setFooter( ArrayList<Object> footer) {
		this.footer = footer;
	}
}
