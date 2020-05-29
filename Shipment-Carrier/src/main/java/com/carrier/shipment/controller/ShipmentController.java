package com.carrier.shipment.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrier.shipment.model.ShipmentRequest;
import com.carrier.shipment.model.ShipmentResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@RestController
@Api(value = "Shipment", description = "Moving then material from wherehouse to wherehouse.")
public class ShipmentController
{

	@ApiOperation(httpMethod = "POST", value = "Creating Shipment Request.", notes = "Create Shipment Request.", response = ShipmentResponse.class, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, authorizations = {
		@Authorization(value = "basicAuth")})
	@ApiResponses(value = {
		@ApiResponse(code = 413, message = "The request header was full and server couldn't process it."),
		@ApiResponse(code = 404, message = "The service is unavailable."),
		@ApiResponse(code = 500, message = "The service is encountered with some internal server issue otherwise it would mean that request sent to server is not properly formatted by the UI according to the schema."),
		@ApiResponse(code = 200, message = "The request was successful and the service is able to get receiver information  from the UI")})
	@PostMapping(path = "/createShipment", consumes = {
		MediaType.APPLICATION_JSON_VALUE}, produces = {
			MediaType.APPLICATION_JSON_VALUE})
	public ShipmentResponse createShipment(
		@ApiParam(value = "ShipmentRequest as input to createShipment service.", required = true) @RequestBody ShipmentRequest shipmentRequest)
	{
		return new ShipmentResponse();
	}

}
