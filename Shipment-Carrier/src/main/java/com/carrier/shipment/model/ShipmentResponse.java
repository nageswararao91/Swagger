package com.carrier.shipment.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Getter
@Setter
@ApiModel(description = "It's all about the Shipment Response details.")
public class ShipmentResponse implements Serializable
{

	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private static final long serialVersionUID = -5695231764303321269L;

	@ApiModelProperty(notes = "ShipmentRequstId generated by System..")
	private String shipRequestId;
	@ApiModelProperty(notes = "It is generated by System. To track the shipment.")
	private String trackingNo;
	@ApiModelProperty(notes = "It is generated by System. To know the shipment status.")
	private String shipReqStatus;
	@ApiModelProperty(notes = "It is generated by System. It gives the expedted date for theshipment.")
	private String shipmentExpectedDate;
}
