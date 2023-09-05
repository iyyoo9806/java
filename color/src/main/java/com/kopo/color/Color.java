package com.kopo.color;

public class Color {
	int idx;
	String code;
	String created;
	
	Color(){
		
	}
	
	Color(String code, String created){
		this.code = code;
		this.created = created;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}
}
