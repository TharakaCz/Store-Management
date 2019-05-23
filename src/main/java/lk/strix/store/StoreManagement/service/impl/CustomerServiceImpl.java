/**
 * May 23, 2019	
 * Store-Management
 * lk.strix.store.StoreManagement.service.impl
 */
package lk.strix.store.StoreManagement.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.strix.store.StoreManagement.dto.CustomerDTO;
import lk.strix.store.StoreManagement.entity.CustomerEntity;
import lk.strix.store.StoreManagement.repository.CustomerRepository;
import lk.strix.store.StoreManagement.service.CustomerService;
import lk.strix.store.StoreManagement.utill.AppConstent;

/**
 * @author Tharaka Chandralal
 */
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see lk.strix.store.StoreManagement.service.CustomerService#saveCustomer(lk.strix.store.StoreManagement.dto.CustomerDTO)
	 */
	@Override
	public String saveCustomer(CustomerDTO customerDTO) throws Exception {
		
		
		CustomerEntity customerEntity = new CustomerEntity();
			customerEntity.setCustomerId(UUID.randomUUID().toString());
			customerEntity.setCustomerName(customerDTO.getCustomerName());
			customerEntity.setAddress(customerDTO.getAddress());
			customerEntity.setGender(customerDTO.getGender());
			customerEntity.setLanPhoneNumber(customerDTO.getLanPhoneNumber());
			customerEntity.setMobileNumber(customerDTO.getMobileNumber());
			customerEntity.setNic(customerDTO.getNic());
			customerEntity.setStatus(AppConstent.ACTIVE);
			
			customerRepository.save(customerEntity);
		
		return "Customer Add Succsess";
	}

	/* (non-Javadoc)
	 * @see lk.strix.store.StoreManagement.service.CustomerService#deleteCustomer(java.lang.Integer)
	 */
	@Override
	public String deleteCustomer(String nic) throws Exception {
		
		CustomerEntity customerEntity = customerRepository.findOneByNic(nic);
		
		customerEntity.setStatus(AppConstent.DEACTIVE);
		
		return "Delete Succsess";
	}

	/* (non-Javadoc)
	 * @see lk.strix.store.StoreManagement.service.CustomerService#updateCustomer(lk.strix.store.StoreManagement.dto.CustomerDTO)
	 */
	@Override
	public String updateCustomer(CustomerDTO customerDTO) throws Exception {
		
		CustomerEntity customerEntity = customerRepository.findOneByCustomerId(customerDTO.getCustomerId());
		 
		customerEntity.setCustomerName(customerDTO.getCustomerName());
		customerEntity.setAddress(customerDTO.getAddress());
		customerEntity.setGender(customerDTO.getGender());
		customerEntity.setLanPhoneNumber(customerDTO.getLanPhoneNumber());
		customerEntity.setMobileNumber(customerDTO.getMobileNumber());
		customerEntity.setNic(customerDTO.getNic());
		customerEntity.setStatus(AppConstent.ACTIVE);
		
		customerRepository.save(customerEntity);
		
		return "Customer Succsessfully Updated";
	}

	/* (non-Javadoc)
	 * @see lk.strix.store.StoreManagement.service.CustomerService#searchCustomer(java.lang.Integer)
	 */
	@Override
	public CustomerDTO searchCustomer(String nic) throws Exception {
		
		CustomerEntity customerEntity = customerRepository.findOneByNic(nic);
		
		CustomerDTO customerDTO = new CustomerDTO();
		
		customerDTO.setAddress(customerEntity.getAddress());
		customerDTO.setCustomerName(customerEntity.getCustomerName());
		customerDTO.setGender(customerEntity.getGender());
		customerDTO.setLanPhoneNumber(customerEntity.getLanPhoneNumber());
		customerDTO.setMobileNumber(customerEntity.getMobileNumber());
		customerDTO.setNic(customerEntity.getNic());
		
		return customerDTO;
	}

	/* (non-Javadoc)
	 * @see lk.strix.store.StoreManagement.service.CustomerService#getAllCustomers()
	 */
	@Override
	public List<CustomerDTO> getAllCustomers() throws Exception {
		
		List<CustomerEntity> getAllCustomers = customerRepository.findAllByStatus(AppConstent.ACTIVE);
		
		ArrayList<CustomerDTO> customerList = new ArrayList<>();
		
		getAllCustomers.forEach(each->{
			customerList.add(getCustomer(each));
		});
		
		return customerList;
	}

	private CustomerDTO getCustomer(CustomerEntity customerEntity) {
		
		CustomerDTO customerDTO= new CustomerDTO();
		
		customerDTO.setCustomerId(customerEntity.getCustomerId());
		customerDTO.setCustomerName(customerEntity.getCustomerName());
		customerDTO.setAddress(customerEntity.getAddress());
		customerDTO.setGender(customerEntity.getGender());
		customerDTO.setLanPhoneNumber(customerEntity.getLanPhoneNumber());
		customerDTO.setMobileNumber(customerEntity.getMobileNumber());
		customerDTO.setNic(customerEntity.getNic());
		
		return customerDTO;
	}
}
