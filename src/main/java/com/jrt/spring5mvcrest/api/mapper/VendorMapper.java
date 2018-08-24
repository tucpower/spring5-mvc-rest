package com.jrt.spring5mvcrest.api.mapper;

import com.jrt.spring5mvcrest.api.model.VendorDTO;
import com.jrt.spring5mvcrest.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    //@Mapping(source = "id", target = "id")
    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOToVendor(VendorDTO vendorDTO);
}
