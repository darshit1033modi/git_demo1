package com.ass.ums.dto;

import java.io.Serializable;

public class AppResponseDto implements Serializable {
	
	private String statusCode;
	
	private String status;
	
	private Object data;
	
	private String error;
	
	public AppResponseDto() {
		// TODO Auto-generated constructor stub
	}

	public AppResponseDto(String statusCode, String status, Object data, String error) {
		super();
		this.statusCode = statusCode;
		this.status = status;
		this.data = data;
		this.error = error;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "AppResponseDto [statusCode=" + statusCode + ", status=" + status + ", data=" + data + ", error=" + error
				+ "]";
	}

}
