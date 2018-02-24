package com.base.util;

import com.base.util.CommonConstant;

/**
 * 类说明：树形结构VO
 * @author CHENWEI
 * 2016年8月30日
 */
public class ZtreeVO {
	private Integer id;//节点ID
	private Integer pId;//父ID
	private String name;//名称
	private String openUrl;//URL
	private String target;//打开窗口名称
	private boolean open = CommonConstant.zTreeNodeIsOpen;//是否打开
	private boolean isChecked = CommonConstant.zTreeNodeIsOpen;//是否选中
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public String getOpenUrl() {
		return openUrl;
	}
	public void setOpenUrl(String openUrl) {
		this.openUrl = openUrl;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public boolean isChecked() {
		return isChecked;
	}
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
}
