/**
 * May 23, 2019	
 * Store-Management
 * lk.strix.store.StoreManagement.repository
 */
package lk.strix.store.StoreManagement.repository;


import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


import lk.strix.store.StoreManagement.entity.CustomerEntity;

/**
 * @author Tharaka Chandralal
 */
public interface CustomerRepository extends JpaRepository<CustomerEntity, String>{

	CustomerEntity findOneByNic(String nic);
	
	List<CustomerEntity>findAllByStatus(String status);
	
	CustomerEntity findOneByCustomerId(String uuid);
}
