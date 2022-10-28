package guru.springfamework.services;

import guru.springfamework.api.v1.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerById(Long id);
    CustomerDTO getCustomerByLastName(String lastName);
    CustomerDTO createNewCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO);
    CustomerDTO patchCustomer(Long id, CustomerDTO customerDTO);
    void deleteCustomerById(Long id);
}
