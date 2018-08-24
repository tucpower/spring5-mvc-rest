package com.jrt.spring5mvcrest.api.model;

import java.util.List;

public class VendorListDTO {

    private List<VendorDTO> vendors;

    public VendorListDTO(List<VendorDTO> vendors) {
        this.vendors = vendors;
    }

    public List<VendorDTO> getVendors() {
        return vendors;
    }

    public void setVendors(List<VendorDTO> vendors) {
        this.vendors = vendors;
    }
}
