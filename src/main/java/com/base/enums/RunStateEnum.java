package com.base.enums;

public enum RunStateEnum {
	RUN("运行中", "RUN"),
	WAIT("等待中", "WAIT"),
	;

	private RunStateEnum(String name, String value) {
		this.name = name;
		this.value = value;
	}

	private String name;
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
