package guru.springfamework.services;

import guru.springfamework.api.v1.model.VendorDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VendorService {
    List<VendorDTO> getAllVendors();
    VendorDTO findVendorById(Long id);
}
