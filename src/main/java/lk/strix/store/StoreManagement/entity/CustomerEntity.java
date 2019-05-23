/**
 * May 23, 2019	
 * Store-Management
 * lk.strix.store.StoreManagement.entity
 */
package lk.strix.store.StoreManagement.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Tharaka Chandralal
 */
@Entity
@Table(name="CUSTOMER")
public class CustomerEntity {

	@Id
	@Column(name="CUSTOMER_ID",length=255)
	private String customerId;
	
	@Column(name="CUSTOMER_NAME",length=100,nullable=false)
	private String customerName;

	@Column(name="MOBILE_NUMBER",length=10)
	private String mobileNumber;
	
	@Column(name="LAN_PHONE_NUMBER",length=10)
	private String lanPhoneNumber;
	
	@Column(name="NATIONAL_IDENTI_CARD",length=10,nullable=false)
	private String nic;
	
	@Column(name="ADDRESS",length=255,nullable=false)
	private String address;
	
	@Column(name="GENDER",length=10)
	private String gender;
	
	@Column(name="STATUS",length=10,nullable=false)
	private String status;
	
	public CustomerEntity() {
		
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getLanPhoneNumber() {
		return lanPhoneNumber;
	}

	

	
	
	
}
