package com.shall.customercomplaints.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class Terminal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "terminal_id")
	private Integer terminalId;

	@Column(name = "terminal_serial_number")
	private String terminalSerialNumber;

	@Column(name = "merchant_id")
	private int merchantId;

	@Column(name = "store_id")
	private int storeId;

	@Column(name = "first_sim_serial")
	private int firstSimSerial;

	@Column(name = "second_sim_serial")
	private int secondSimSerial;

	private String currency;

	@Column(name = "class")
	private String terminalClass;

	private String status;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "deployment_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date deploymentDate;

	private String model;

	@Column(name = "\"condition\"")
	private String condition;

	private boolean sale;

	@Column(name = "online_refund")
	private boolean onlineRefund;

	@Column(name = "offline_refund")
	private boolean offlineRefund;

	@Column(name = "offline_sale")
	private boolean offlineSale;

	@Column(name = "online_void")
	private boolean onlineVoid;

	@Column(name = "offline_void")
	private boolean offlineVoid;

	private boolean preauth;

	private boolean amex;

	private boolean installments;

	@Column(name = "prepaid_services")
	private boolean prepaidServices;

	private boolean diners;

	private boolean premuim;

	@Column(name = "manual_entry")
	private boolean manualEntry;

	private String branch;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "created_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(name = "store_name")
	private String storeName;

	@Column(name = "tender")
	private String tender;

	public Terminal(Integer terminalId, String terminalSerialNumber, int merchantId, int storeId, int firstSimSerial,
			int secondSimSerial, String currency, String terminalClass, String status, Date deploymentDate,
			String model, String condition, boolean sale, boolean onlineRefund, boolean offlineRefund,
			boolean offlineSale, boolean onlineVoid, boolean offlineVoid, boolean preauth, boolean amex,
			boolean installments, boolean prepaidServices, boolean diners, boolean premuim, boolean manualEntry,
			String branch, Date createdDate, String storeName, String tender) {
		super();
		this.terminalId = terminalId;
		this.terminalSerialNumber = terminalSerialNumber;
		this.merchantId = merchantId;
		this.storeId = storeId;
		this.firstSimSerial = firstSimSerial;
		this.secondSimSerial = secondSimSerial;
		this.currency = currency;
		this.terminalClass = terminalClass;
		this.status = status;
		this.deploymentDate = deploymentDate;
		this.model = model;
		this.condition = condition;
		this.sale = sale;
		this.onlineRefund = onlineRefund;
		this.offlineRefund = offlineRefund;
		this.offlineSale = offlineSale;
		this.onlineVoid = onlineVoid;
		this.offlineVoid = offlineVoid;
		this.preauth = preauth;
		this.amex = amex;
		this.installments = installments;
		this.prepaidServices = prepaidServices;
		this.diners = diners;
		this.premuim = premuim;
		this.manualEntry = manualEntry;
		this.branch = branch;
		this.createdDate = createdDate;
		this.storeName = storeName;
		this.tender = tender;
	}

	public Terminal() {
		super();
	}

	public Integer getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(Integer terminalId) {
		this.terminalId = terminalId;
	}

	public String getTerminalSerialNumber() {
		return terminalSerialNumber;
	}

	public void setTerminalSerialNumber(String terminalSerialNumber) {
		this.terminalSerialNumber = terminalSerialNumber;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getFirstSimSerial() {
		return firstSimSerial;
	}

	public void setFirstSimSerial(int firstSimSerial) {
		this.firstSimSerial = firstSimSerial;
	}

	public int getSecondSimSerial() {
		return secondSimSerial;
	}

	public void setSecondSimSerial(int secondSimSerial) {
		this.secondSimSerial = secondSimSerial;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTerminalClass() {
		return terminalClass;
	}

	public void setTerminalClass(String terminalClass) {
		this.terminalClass = terminalClass;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDeploymentDate() {
		return deploymentDate;
	}

	public void setDeploymentDate(Date deploymentDate) {
		this.deploymentDate = deploymentDate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public boolean isSale() {
		return sale;
	}

	public void setSale(boolean sale) {
		this.sale = sale;
	}

	public boolean isOnlineRefund() {
		return onlineRefund;
	}

	public void setOnlineRefund(boolean onlineRefund) {
		this.onlineRefund = onlineRefund;
	}

	public boolean isOfflineRefund() {
		return offlineRefund;
	}

	public void setOfflineRefund(boolean offlineRefund) {
		this.offlineRefund = offlineRefund;
	}

	public boolean isOfflineSale() {
		return offlineSale;
	}

	public void setOfflineSale(boolean offlineSale) {
		this.offlineSale = offlineSale;
	}

	public boolean isOnlineVoid() {
		return onlineVoid;
	}

	public void setOnlineVoid(boolean onlineVoid) {
		this.onlineVoid = onlineVoid;
	}

	public boolean isOfflineVoid() {
		return offlineVoid;
	}

	public void setOfflineVoid(boolean offlineVoid) {
		this.offlineVoid = offlineVoid;
	}

	public boolean isPreauth() {
		return preauth;
	}

	public void setPreauth(boolean preauth) {
		this.preauth = preauth;
	}

	public boolean isAmex() {
		return amex;
	}

	public void setAmex(boolean amex) {
		this.amex = amex;
	}

	public boolean isInstallments() {
		return installments;
	}

	public void setInstallments(boolean installments) {
		this.installments = installments;
	}

	public boolean isPrepaidServices() {
		return prepaidServices;
	}

	public void setPrepaidServices(boolean prepaidServices) {
		this.prepaidServices = prepaidServices;
	}

	public boolean isDiners() {
		return diners;
	}

	public void setDiners(boolean diners) {
		this.diners = diners;
	}

	public boolean isPremuim() {
		return premuim;
	}

	public void setPremuim(boolean premuim) {
		this.premuim = premuim;
	}

	public boolean isManualEntry() {
		return manualEntry;
	}

	public void setManualEntry(boolean manualEntry) {
		this.manualEntry = manualEntry;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getTender() {
		return tender;
	}

	public void setTender(String tender) {
		this.tender = tender;
	}

}
