package com.jrt.spring5mvcrest.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class VendorDTO {

    @ApiModelProperty(value = "The name", required = true)
    private String name;

    @JsonProperty("vendor_url")
    private String vendorUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendorUrl() {
        return vendorUrl;
    }

    public void setVendorUrl(String vendorUrl) {
        this.vendorUrl = vendorUrl;
    }
}
