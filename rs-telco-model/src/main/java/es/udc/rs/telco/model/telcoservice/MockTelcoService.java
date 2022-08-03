package es.udc.rs.telco.model.telcoservice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import es.udc.rs.telco.model.customer.Customer;
import es.udc.rs.telco.model.phonecall.PhoneCall;

public class MockTelcoService implements TelcoService {

	private Map<Long, Customer> clientsMap = new LinkedHashMap<Long, Customer>();
	private Map<Long,PhoneCall> phoneCallsMap = new LinkedHashMap<Long,PhoneCall>();
	private Map<Long,List<PhoneCall>> phoneCallsByUserMap = new LinkedHashMap<Long,List<PhoneCall>>();

	private long lastClientId = 0;
	private long lastPhoneCallId = 0;
	

	private synchronized long getNextClientId() {
		return ++lastClientId;
	}
	
	private synchronized long getNextPhoneCallId() {
		return ++lastPhoneCallId;
	}
	
}
