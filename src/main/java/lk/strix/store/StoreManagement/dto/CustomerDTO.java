/**
 * May 23, 2019	
 * Store-Management
 * lk.strix.store.StoreManagement.dto
 */
package lk.strix.store.StoreManagement.dto;

import java.util.UUID;

/**
 * @author Tharaka Chandralal
 */
public class CustomerDTO {

	private String customerId;
	
	private String customerName;

	private String mobileNumber;
	
	private String lanPhoneNumber;
	
	private String nic;
	
	private String address;
	
	private String gender;


	public CustomerDTO() {
	
	}




	public String getCustomerId() {
		return customerId;
	}




	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}




	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	

	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getLanPhoneNumber() {
		return lanPhoneNumber;
	}


	public void setLanPhoneNumber(String lanPhoneNumber) {
		this.lanPhoneNumber = lanPhoneNumber;
	}


	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
}
