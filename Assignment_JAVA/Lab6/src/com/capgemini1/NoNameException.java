package com.capgemini1;

public class NoNameException extends Exception {
	private String string;
	public  void NoNameNameException(String string) {
		this.string = string;
	}
	@Override
	public String toString() {
		return "NoNameException [string=" + string + "]";
	}

}
