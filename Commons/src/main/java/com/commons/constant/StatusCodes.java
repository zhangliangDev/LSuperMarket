package com.commons.constant;

public enum StatusCodes {

	CODEERRO(1000),//代码异常码
	SERVICEERRO(2000),//业务异常码
	TRANSACTIONERRO(3000),//事务异常码
	PERMISSIONERRO(4000);//权限异常码
	
	
	private int code ;
	
	private StatusCodes(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public static void main(String[] args) {
		System.out.println(StatusCodes.CODEERRO);
	}
}
