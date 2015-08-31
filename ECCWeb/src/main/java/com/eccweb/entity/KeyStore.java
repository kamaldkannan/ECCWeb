package com.eccweb.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class KeyStore {
	@Column( length = 8000)
	private String privateKey;
	@Column( length = 8000)
    private String publicKey;
	@Column( length = 8000)
    private String remoteKey;
	
	public String getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public String getRemoteKey() {
		return remoteKey;
	}
	public void setRemoteKey(String remoteKey) {
		this.remoteKey = remoteKey;
	}
    
}
