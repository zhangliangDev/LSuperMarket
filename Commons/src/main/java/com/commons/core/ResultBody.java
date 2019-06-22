package com.commons.core;

import java.util.List;

/**
 * response 返回对象
 * @author Leon
 *
 * @param <T>
 */
public class ResultBody<T> {

	private boolean success = true;
	
	private int code = 0;//内部状态码，
	
	private T data;
	
	public ResultBody() {
		super();
	}
	
	public ResultBody(T t) {
		this.data = t;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
