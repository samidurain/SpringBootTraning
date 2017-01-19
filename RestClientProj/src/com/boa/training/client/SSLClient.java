package com.boa.training.client;

import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class SSLClient {
	static {
	    //for localhost testing only
	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){

	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	            if (hostname.equals("localhost")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("javax.net.ssl.trustStore", "mytruststore.ks");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		String url="https://localhost:8443/SecurityPrj/rest/first";
		Client client=ClientBuilder.newClient();
		HttpAuthenticationFeature authenticationFeature=HttpAuthenticationFeature.basic("user1", "pass1");
		client.register(authenticationFeature);
		WebTarget target=client.target(url);
		String message=target.request().get(String.class);
		System.out.println("Received Message:"+message);

	}

}