package es.udc.rs.telco.client.service.rest;

import javax.ws.rs.core.MediaType;

public class RestClientTelcoServiceXml extends RestClientTelcoService {
	
	@Override
	protected MediaType getMediaType() {
		return MediaType.APPLICATION_XML_TYPE;
	}	

}
