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
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "merchant_id")
	private Integer merchantId;

	@Column(name = "merchant_name")
	private String merchantName;
	private String email;
	private String MCC;
	private boolean status;
	private String city;
	private String street;
	private String phone1;
	private String phone2;
	private String vendor;
	@Column(name = "contact_person")
	private String contactPerson;
	@Column(name = "amex_merchant_id")
	private String amexMerchantId;
	@Column(name = "premium_id")
	private String premiumId;
	@Column(name = "class")
	private String merchantClass;
	private String currency;
	public Merchant(Integer merchantId, String merchantName, String email, String mCC, boolean status, String city,
			String street, String phone1, String phone2, String vendor, String contactPerson, String amexMerchantId,
			String premiumId, String merchantClass, String currency) {
		super();
		this.merchantId = merchantId;
		this.merchantName = merchantName;
		this.email = email;
		MCC = mCC;
		this.status = status;
		this.city = city;
		this.street = street;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.vendor = vendor;
		this.contactPerson = contactPerson;
		this.amexMerchantId = amexMerchantId;
		this.premiumId = premiumId;
		this.merchantClass = merchantClass;
		this.currency = currency;
	}
	public Merchant() {
		super();
	}
	public Integer getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMCC() {
		return MCC;
	}
	public void setMCC(String mCC) {
		MCC = mCC;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getAmexMerchantId() {
		return amexMerchantId;
	}
	public void setAmexMerchantId(String amexMerchantId) {
		this.amexMerchantId = amexMerchantId;
	}
	public String getPremiumId() {
		return premiumId;
	}
	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}
	public String getMerchantClass() {
		return merchantClass;
	}
	public void setMerchantClass(String merchantClass) {
		this.merchantClass = merchantClass;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	
}
