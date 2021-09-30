package com.redhat.challenge.discount.model;

import java.util.Objects;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class DiscountCode {

	@ProtoField(number = 1)
	String name;
	@ProtoField(number = 2)
	Integer amount;
	@ProtoField(number = 3)
	String enterprise;
	@ProtoField(number = 4)
	DiscountCodeType type;
	@ProtoField(number = 5)
	Integer used;
	@ProtoField(number = 6)
	Long expiration;

	@ProtoFactory
	public DiscountCode(String name, Integer amount, String enterprise, DiscountCodeType type, Integer used,
			Long expiration) {
		this.name = name;
		this.amount = amount;
		this.enterprise = enterprise;
		this.type = type;
		this.used = used;
		this.expiration = expiration;
	}

	public DiscountCode() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public DiscountCodeType getType() {
		return type;
	}

	public void setType(DiscountCodeType type) {
		this.type = type;
	}

	public Integer getUsed() {
		return used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}

	public Long getExpiration() {
		return expiration;
	}

	public void setExpiration(Long expiration) {
		this.expiration = expiration;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		DiscountCode that = (DiscountCode) o;
		return Objects.equals(name, that.name) && Objects.equals(amount, that.amount)
				&& Objects.equals(enterprise, that.enterprise) && type == that.type && Objects.equals(used, that.used);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, amount, enterprise, type, used);
	}

	@Override
	public String toString() {
		return "DiscountCode{" + "name='" + name + '\'' + ", amount=" + amount + ", enterprise='" + enterprise + '\''
				+ ", type=" + type + ", used=" + used + ", expiration=" + expiration + '}';
	}
}
