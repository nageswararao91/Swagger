package com.carrier.shipment.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(description = "It's all about the Country.")
public class Country implements Serializable
{
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private static final long serialVersionUID = 1728866239711467541L;

	@ApiModelProperty(notes = "To set the country code.", allowableValues = "India,America,Chaina", allowEmptyValue = false)
	private String countryCode;
	@ApiModelProperty(notes = "To set the country name.")
	private String countryName;
}
