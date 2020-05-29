package com.carrier.shipment.model;

import java.io.Serializable;

import org.springframework.web.bind.annotation.ModelAttribute;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(description = "All details about the Address.")
public class Address implements Serializable
{
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private static final long serialVersionUID = 7398015940922686419L;

	@ApiModelProperty(notes = "To set the Street line1")
	private String streetAddress1;
	@ApiModelProperty(notes = "To set the Street line2")
	private String streetAddress2;
	@ApiModelProperty(notes = "To set the Street line3")
	private String streetAddress3;
	@ApiModelProperty(notes = "To set the Town")
	private String town;
	@ApiModelProperty(notes = "To set the Postal code")
	private String postCode;
	@ApiModelProperty(notes = "To set the phone number")
	private String phoneNo;
	@ApiModelProperty(notes = "To set the Country information")
	Country CountryObject;
}
