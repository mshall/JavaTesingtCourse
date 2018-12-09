package com.shall.customercomplaints.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "store_id")
	private Integer storeId;

	@Column(name = "store_name")
	private String storeName;

	@Column(name = "store_address")
	private String store_address;

	@Column(name = "store_details")
	private String storeDetails;

	public Store() {
		super();
	}

	public Store(Integer storeId, String storeName, String store_address, String storeDetails) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.store_address = store_address;
		this.storeDetails = storeDetails;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStore_address() {
		return store_address;
	}

	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}

	public String getStoreDetails() {
		return storeDetails;
	}

	public void setStoreDetails(String storeDetails) {
		this.storeDetails = storeDetails;
	}

}