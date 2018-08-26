package es.udc.rs.telco.model.phonecall;

import java.util.Calendar;

public class PhoneCall {

    private Long phoneCallId;
    private Long clientId;
    private Calendar startDate;
    private Long duration;
    private String destinationNumber;
    private PhoneCallType phoneCallType;
    private PhoneCallStatus phoneCallStatus;
    
	public PhoneCall(Long clientId, Calendar startDate, Long duration, String destinationNumber,
			PhoneCallType phoneCallType) {
		super();
		this.clientId = clientId;
		this.startDate = startDate;
		this.duration = duration;
		this.destinationNumber = destinationNumber;
		this.phoneCallType = phoneCallType;
	}

	public Long getPhoneCallId() {
		return phoneCallId;
	}

	public void setPhoneCallId(Long phoneCallId) {
		this.phoneCallId = phoneCallId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getDestinationNumber() {
		return destinationNumber;
	}

	public void setDestinationNumber(String destinationNumber) {
		this.destinationNumber = destinationNumber;
	}

	public PhoneCallType getPhoneCallType() {
		return phoneCallType;
	}

	public void setPhoneCallType(PhoneCallType phoneCallType) {
		this.phoneCallType = phoneCallType;
	}

	public PhoneCallStatus getPhoneCallStatus() {
		return phoneCallStatus;
	}

	public void setPhoneCallStatus(PhoneCallStatus phoneCallStatus) {
		this.phoneCallStatus = phoneCallStatus;
	}	

	
    
}