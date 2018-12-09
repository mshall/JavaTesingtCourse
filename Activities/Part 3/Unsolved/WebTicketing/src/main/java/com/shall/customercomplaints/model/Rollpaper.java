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
public class Rollpaper {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "roll_paper_id")
	private Integer rollpaperId;

	@Column(name = "roll_paper_size")
	private String rollpaperSize;

	@Column(name = "total_in")
	private int totalIn;

	@Column(name = "store_id")
	private int storeId;

	@Column(name = "store_name")
	private String storeName;

	private int out;

	private int remaining;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "action_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date actionDate;

	public Rollpaper(Integer rollpaperId, String rollpaperSize, int totalIn, int storeId, String storeName, int out,
			int remaining, Date actionDate) {
		super();
		this.rollpaperId = rollpaperId;
		this.rollpaperSize = rollpaperSize;
		this.totalIn = totalIn;
		this.storeId = storeId;
		this.storeName = storeName;
		this.out = out;
		this.remaining = remaining;
		this.actionDate = actionDate;
	}

	public Rollpaper() {
		super();
	}

	public Integer getRollpaperId() {
		return rollpaperId;
	}

	public void setRollpaperId(Integer rollpaperId) {
		this.rollpaperId = rollpaperId;
	}

	public String getRollpaperSize() {
		return rollpaperSize;
	}

	public void setRollpaperSize(String rollpaperSize) {
		this.rollpaperSize = rollpaperSize;
	}

	public int getTotalIn() {
		return totalIn;
	}

	public void setTotalIn(int totalIn) {
		this.totalIn = totalIn;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

}
