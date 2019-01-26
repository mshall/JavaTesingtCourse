package com.shall.common.core.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * response body that returned in case of error
 */
@Data
public class ErrorResponse {

	public String message;
	public String description;
	public String error;
	public String transactionId;
	public int eCode;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public int geteCode() {
		return eCode;
	}
	public void seteCode(int eCode) {
		this.eCode = eCode;
	}
	
	

}
