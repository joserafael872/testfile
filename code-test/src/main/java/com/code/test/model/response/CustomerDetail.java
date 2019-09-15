package com.code.test.model.response;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDetail {

	/**
	 * customer id.
	 */
	@JsonProperty("customerId")
	private Long customerId;

	/**
	 * Original channel.
	 */
	@Column
	@NotNull
	@JsonProperty("originChannel")
	private String originChannel;

	/**
	 * full name client.
	 */
	@Column
	@NotNull
	@JsonProperty("fullName")
	private String fullName;

	/**
	 * condition client.
	 */
	@Column
	@NotNull
	@JsonProperty("condition")
	private String condition;

	/**
	 * segment card client.
	 */
	@Column
	@NotNull
	@JsonProperty("segment")
	private String segment;

	/**
	 * client address.
	 */
	@Column
	@NotNull
	@JsonProperty("address")
	private String address;

	/**
	 * customer category client.
	 */
	@Column
	@NotNull
	@JsonProperty("customerCategory")
	private String customerCategory;

}
