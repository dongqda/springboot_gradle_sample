package com.demo.bluemine.dto;

public class MainDto {
	private int num;
	private String name;

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MainDto{" +
				"num=" + num +
				", name='" + name + '\'' +
				'}';
	}
}
