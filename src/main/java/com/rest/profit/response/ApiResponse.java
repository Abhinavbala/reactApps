package com.rest.profit.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class ApiResponse {
	private boolean status;
	private String message;
	private Object data;

	public ApiResponse(boolean status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public ApiResponse(boolean status, String message) {
		this.status = status;
		this.message = message;
	}

	public ApiResponse() {

	}

}
