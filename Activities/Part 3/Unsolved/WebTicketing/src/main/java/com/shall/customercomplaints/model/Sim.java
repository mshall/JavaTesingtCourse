package com.shall.customercomplaints.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class Sim {
	@Id
	@Column(name = "sim_serial")
	private Integer simSerial;

	private String operator;
	/*
	 * 0 -> New | 1 -> Used
	 */
	@Column(name = "sim_condition")
	private boolean simCondition;

	/*
	 * 0 -> Stocked | 1 -> Deployed
	 */
	private boolean status;

	@Column(name = "store_id")
	private int storeId;

	@Column(name = "merchant_id")
	private int merchantId;

	@Column(name = "terminal_id")
	private int terminalId;

	@Column(name = "store_name")
	private String storeName;

	@Column(name = "terminal_serial")
	private String terminalSerial;

	@Column(name = "merchant_name")
	private String merchantName;

	public Sim(Integer simSerial, String operator, boolean simCondition, boolean status, int storeId, int merchantId,
			int terminalId, String storeName, String terminalSerial, String merchantName) {
		super();
		this.simSerial = simSerial;
		this.operator = operator;
		this.simCondition = simCondition;
		this.status = status;
		this.storeId = storeId;
		this.merchantId = merchantId;
		this.terminalId = terminalId;
		this.storeName = storeName;
		this.terminalSerial = terminalSerial;
		this.merchantName = merchantName;
	}

	public Sim() {
		super();
	}

	public Integer getSimSerial() {
		return simSerial;
	}

	public void setSimSerial(Integer simSerial) {
		this.simSerial = simSerial;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public boolean isSimCondition() {
		return simCondition;
	}

	public void setSimCondition(boolean simCondition) {
		this.simCondition = simCondition;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public int getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getTerminalSerial() {
		return terminalSerial;
	}

	public void setTerminalSerial(String terminalSerial) {
		this.terminalSerial = terminalSerial;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	
	
	
}