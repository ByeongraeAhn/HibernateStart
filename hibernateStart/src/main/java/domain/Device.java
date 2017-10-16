package domain;

public class Device {
	private String userId;
	private String deviceId;
	private String phoneNumber;

	public Device() {
	}
	
	public Device(String userId, String deviceId, String phoneNumber) {
		super();
		this.userId = userId;
		this.deviceId = deviceId;
		this.phoneNumber = phoneNumber;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}



}
