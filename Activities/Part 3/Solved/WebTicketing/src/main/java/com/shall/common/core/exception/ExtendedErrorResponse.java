package com.shall.common.core.exception;

import java.util.Map;

import lombok.Data;

@Data
public class ExtendedErrorResponse extends ErrorResponse {


	private Map<String, String> additionalInfo;

	public Map<String, String> getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	
	
}