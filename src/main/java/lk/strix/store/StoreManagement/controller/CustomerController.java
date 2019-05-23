/**
 * May 23, 2019	
 * Store-Management
 * lk.strix.store.StoreManagement.controller
 */
package lk.strix.store.StoreManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.strix.store.StoreManagement.dto.CustomerDTO;
import lk.strix.store.StoreManagement.service.CustomerService;

/**
 * @author Tharaka Chandralal
 */
@RestController
@CrossOrigin
@RequestMapping(value="/strix/store/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value="/saveCustomer")
	public ResponseEntity<Object>saveCustomer(@RequestBody CustomerDTO customerDTO)throws Exception{
		return new ResponseEntity<Object>(customerService.saveCustomer(customerDTO), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deleteCustomer/{nic}")
	public ResponseEntity<Object>deleteCustomer(@PathVariable("nic")String nic)throws Exception{
		return new ResponseEntity<Object>(customerService.deleteCustomer(nic),HttpStatus.OK);
	}
	
	@PostMapping(value="/updateCustomer")
	public ResponseEntity<Object>updateCustomer(@RequestBody CustomerDTO customerDTO)throws Exception{
		return new ResponseEntity<Object>(customerService.updateCustomer(customerDTO),HttpStatus.OK);
	}
	
	@GetMapping(value="/searchCustomer/{nic}")
	public ResponseEntity<Object>searchCustomer(@PathVariable("nic") String nic)throws Exception{
		return new ResponseEntity<Object>(customerService.searchCustomer(nic),HttpStatus.OK);
	}
	
	@GetMapping(value="/getAllCustomers")
	public ResponseEntity<Object>getAllCustomers()throws Exception{
		return new ResponseEntity<Object>(customerService.getAllCustomers(),HttpStatus.OK);
	}
}

