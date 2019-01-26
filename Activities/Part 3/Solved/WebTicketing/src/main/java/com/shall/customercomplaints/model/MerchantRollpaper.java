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
public class MerchantRollpaper {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "roll_paper_id")
	private int rollpaperId;

	@Column(name = "merchant_id")
	private int merchantId;

	@Column(name = "roll_paper_out_number")
	private int rollpaperOutNumber;

	private int remaining;

	@Column(name = "meet_sla")
	private String meetSla;

	private String note;

	@Column(name = "merchant_name")
	private String merchantName;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "action_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date actionDate;

	@Column(name = "rollpaper_size")
	private String rollpaperSize;

	public MerchantRollpaper(Integer id, int rollpaperId, int merchantId, int rollpaperOutNumber, int remaining,
			String meetSla, String note, String merchantName, Date actionDate, String rollpaperSize) {
		super();
		this.id = id;
		this.rollpaperId = rollpaperId;
		this.merchantId = merchantId;
		this.rollpaperOutNumber = rollpaperOutNumber;
		this.remaining = remaining;
		this.meetSla = meetSla;
		this.note = note;
		this.merchantName = merchantName;
		this.actionDate = actionDate;
		this.rollpaperSize = rollpaperSize;
	}

	public MerchantRollpaper() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getRollpaperId() {
		return rollpaperId;
	}

	public void setRollpaperId(int rollpaperId) {
		this.rollpaperId = rollpaperId;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public int getRollpaperOutNumber() {
		return rollpaperOutNumber;
	}

	public void setRollpaperOutNumber(int rollpaperOutNumber) {
		this.rollpaperOutNumber = rollpaperOutNumber;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public String getMeetSla() {
		return meetSla;
	}

	public void setMeetSla(String meetSla) {
		this.meetSla = meetSla;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	public String getRollpaperSize() {
		return rollpaperSize;
	}

	public void setRollpaperSize(String rollpaperSize) {
		this.rollpaperSize = rollpaperSize;
	}

}
