package com.bootcamp.bank.components.base.mappers;

public interface ISimpleMapperObject<E, Dto>{

	public Dto entityToDto(E entity);
	public  E dtoToEntity(Dto dto);
}
