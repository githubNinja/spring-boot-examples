package com.spring.bootexamples.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PayloadCartItem {

    @NotBlank(message = "colour can't be empty.")
    private String colour;

    @NotBlank(message = "item size - S, M, L, XL")
    private String size;

    @ApiModelProperty(required = true, position = 1, dataType = "java.lang.String", value =
            "Example - {'colour':'colourValue'} , \n Description -> colour can't be empty For Prod but can be empty for Non-Prod")
    public String getColour() {
        return colour;
    }

    @ApiModelProperty(required = true, position = 2, dataType = "java.lang.String", value =
            "Example- {'size':'sizeValue'} , \n Description -> size can't be empty")
    public String getSize() {
        return size;
    }



}
