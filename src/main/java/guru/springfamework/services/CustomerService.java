package guru.springfamework.services;

import guru.springfamework.api.v1.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerByLastName(String lastName);
}
