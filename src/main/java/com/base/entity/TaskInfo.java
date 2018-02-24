package com.base.entity;

import java.util.List;

public class TaskInfo {
	private String className;
	private String serviceName;
	private String value;
	private List<TaskInfoMethod> taskInfoMethods;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<TaskInfoMethod> getTaskInfoMethods() {
		return taskInfoMethods;
	}
	public void setTaskInfoMethods(List<TaskInfoMethod> taskInfoMethods) {
		this.taskInfoMethods = taskInfoMethods;
	}
}
