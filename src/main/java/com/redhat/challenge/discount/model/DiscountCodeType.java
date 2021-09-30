package com.redhat.challenge.discount.model;

import org.infinispan.protostream.annotations.ProtoEnumValue;


public enum DiscountCodeType {
	@ProtoEnumValue(number = 0)
   PERCENT,
	@ProtoEnumValue(number = 1)
   VALUE
}
