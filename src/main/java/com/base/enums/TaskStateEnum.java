package com.base.enums;

public enum TaskStateEnum {
	ENABLE("启用", "ENABLE"),
	DISABLE("停用", "DISABLE"),
	;

	private TaskStateEnum(String name, String value) {
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
