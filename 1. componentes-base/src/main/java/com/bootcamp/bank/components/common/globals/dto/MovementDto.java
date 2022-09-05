package com.bootcamp.bank.components.common.globals.dto;

import java.time.LocalDateTime;

import com.bootcamp.bank.components.dto.BaseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovementDto extends BaseDto{

	private String id;

	private String movementType;
	private double movementAmount;

	private String productId;
	private LocalDateTime movementDate;
}