package com.code.test.model.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "userEntity")
@Table(name = "UserEntityTable")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

@Getter
@Setter
/**
 * Entity class where User info will be stored.
 */
public class UserEntityTable {

	/**
	 * Identifier of each client.
	 */
	@Id
	@SequenceGenerator(name = "user_entity_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_entity_id_seq")
	@JsonProperty("customerId")
	private Long customerId;

	/**
	 * Original channel from DB.
	 */
	@Column
	@NotNull
	@JsonProperty("originChannelDb")
	private String originChannel;

	/**
	 * full name client from DB.
	 */
	@Column
	@NotNull
	@JsonProperty("fullNameDb")
	private String fullName;

	/**
	 * condition client from DB.
	 */
	@Column
	@NotNull
	@JsonProperty("conditionDb")
	private String condition;

	/**
	 * segment card client from DB.
	 */
	@Column
	@NotNull
	@JsonProperty("segmentDb")
	private String segment;

	/**
	 * client address from DB.
	 */
	@Column
	@NotNull
	@JsonProperty("addressDb")
	private String address;

	/**
	 * customer category client from DB.
	 */
	@Column
	@NotNull
	@JsonProperty("customerCategoryDb")
	private String customerCategory;

}
