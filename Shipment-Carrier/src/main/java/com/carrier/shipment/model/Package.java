package com.carrier.shipment.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(description = "It's all about the Package details.")
public class Package implements Serializable
{
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private static final long serialVersionUID = -3338764314789720811L;

	@ApiModelProperty(notes = "To set the Package id.")
	private String packageId;
	@ApiModelProperty(notes = "To set the Package type.")
	private String packageType;
	@ApiModelProperty(notes = "To set the package length.")
	private long length;
	@ApiModelProperty(notes = "To set the package weidth.")
	private long weidth;
	@ApiModelProperty(notes = "To set the package height.")
	private long hieght;
	@ApiModelProperty(notes = "To set the package weight.")
	private double weight;
	@ApiModelProperty(notes = "To set the package uom. ex.KG/LB")
	private String uom;
	@ApiModelProperty(notes = "To set the package seal id..")
	private String sealId;
}
