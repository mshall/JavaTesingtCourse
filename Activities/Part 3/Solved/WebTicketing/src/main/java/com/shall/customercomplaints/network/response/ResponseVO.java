package com.shall.customercomplaints.network.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Mohamed S. El-Shall <a href="www.facebook.com/M.S.ElShall">Catch
 *         me</a>
 * @param <T> of type
 */

public class ResponseVO<T> {
	public int code;
	public String message;
	public T results;

	public ResponseVO(T results) {
		this.results = results;
	}

	public ResponseVO() {
		super();
	}

	public ResponseVO(int code, String message, T results) {
		super();
		this.code = code;
		this.message = message;
		this.results = results;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResults() {
		return results;
	}

	public void setResults(T results) {
		this.results = results;
	}

}
