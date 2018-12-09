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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class Complaint {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "complaint_id")
	private Long complaintId;

	@Column(name = "customer_email")
	private String customerEmail;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "complaint_opening_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date complaintOpeningTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "complaint_closing_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date complaintClosingTime;

	@Column(name = "status")
	private String status;

	private String comments;

	@Column(name = "merchant_id")
	private int merchantId;

	@Column(name = "terminal_id")
	private int terminalId;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "technician_id")
	private int technicianId;

	@Column(name = "complaint_solution")
	private String complaintSolution;

	@Column(name = "complaint_note")
	private String complaintNote;

	@Column(name = "merchant_name")
	private String merchantName;

	@Column(name = "merchantCity")
	private String merchantCity;

	@Column(name = "merchantAddress")
	private String merchantAddress;

	@Column(name = "terminal_serial")
	private String terminalSerial;

	public Complaint() {
		super();
	}

	public Complaint(Long complaintId, String customerEmail, Date complaintOpeningTime, Date complaintClosingTime,
			String status, String comments, int merchantId, int terminalId, String phoneNumber, int technicianId,
			String complaintSolution, String complaintNote, String merchantName, String merchantCity,
			String merchantAddress, String terminalSerial) {
		super();
		this.complaintId = complaintId;
		this.customerEmail = customerEmail;
		this.complaintOpeningTime = complaintOpeningTime;
		this.complaintClosingTime = complaintClosingTime;
		this.status = status;
		this.comments = comments;
		this.merchantId = merchantId;
		this.terminalId = terminalId;
		this.phoneNumber = phoneNumber;
		this.technicianId = technicianId;
		this.complaintSolution = complaintSolution;
		this.complaintNote = complaintNote;
		this.merchantName = merchantName;
		this.merchantCity = merchantCity;
		this.merchantAddress = merchantAddress;
		this.terminalSerial = terminalSerial;
	}

	public Long getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(Long complaintId) {
		this.complaintId = complaintId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Date getComplaintOpeningTime() {
		return complaintOpeningTime;
	}

	public void setComplaintOpeningTime(Date complaintOpeningTime) {
		this.complaintOpeningTime = complaintOpeningTime;
	}

	public Date getComplaintClosingTime() {
		return complaintClosingTime;
	}

	public void setComplaintClosingTime(Date complaintClosingTime) {
		this.complaintClosingTime = complaintClosingTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTechnicianId() {
		return technicianId;
	}

	public void setTechnicianId(int technicianId) {
		this.technicianId = technicianId;
	}

	public String getComplaintSolution() {
		return complaintSolution;
	}

	public void setComplaintSolution(String complaintSolution) {
		this.complaintSolution = complaintSolution;
	}

	public String getComplaintNote() {
		return complaintNote;
	}

	public void setComplaintNote(String complaintNote) {
		this.complaintNote = complaintNote;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}

	public String getMerchantAddress() {
		return merchantAddress;
	}

	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}

	public String getTerminalSerial() {
		return terminalSerial;
	}

	public void setTerminalSerial(String terminalSerial) {
		this.terminalSerial = terminalSerial;
	}

}
