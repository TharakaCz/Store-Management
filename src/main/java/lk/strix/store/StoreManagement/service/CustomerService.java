/**
 * May 23, 2019	
 * Store-Management
 * lk.strix.store.StoreManagement.service
 */
package lk.strix.store.StoreManagement.service;

import java.util.List;

import lk.strix.store.StoreManagement.dto.CustomerDTO;

/**
 * @author Tharaka Chandralal
 */
public interface CustomerService {

	public String saveCustomer(CustomerDTO customerDTO)throws Exception;
	
	public String deleteCustomer(String nic)throws Exception;
	
	public String updateCustomer(CustomerDTO customerDTO)throws Exception;
	
	public CustomerDTO searchCustomer(String nic)throws Exception;
	
	public List<CustomerDTO>getAllCustomers()throws Exception;
	
}
