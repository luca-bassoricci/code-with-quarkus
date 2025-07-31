package org.acme;

import org.hibernate.annotations.Formula;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MyEntity
{
	@Id
	int id;
	@Column(name = "int_value")
	int intValue;
	@Formula("int_value * 2")
	int doubleIntValue;

	public void setIntValue(int intValue)
	{
		this.intValue = intValue;
	}

	public int getIntValue()
	{
		return intValue;
	}

	public int getDoubleIntValue()
	{
		return doubleIntValue;
	}
}
