package com.carrier.shipment.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(description = "It all about the shipment Requset details.")
public class ShipmentRequest implements Serializable
{
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private static final long serialVersionUID = -8524728928259685683L;

	@ApiModelProperty(notes = "To set the shipper name.")
	private String shipperName;
	@ApiModelProperty(notes = "To set the shipper address.")
	private Address shipperAddress;
	@ApiModelProperty(notes = "To set the recipient name.")
	private String recipientName;
	@ApiModelProperty(notes = "To set the recipient address.")
	private Address recipientAddress;
	@ApiModelProperty(notes = "To set the shipment pacakges.")
	private Package packages;
	@ApiModelProperty(notes = "To set the requsetd shipment date.")
	private String requestedShipDate;
}
