package com.redhat.challenge.discount.model;

import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

import com.redhat.challenge.discount.DiscountCodes;

@AutoProtoSchemaBuilder(includeClasses = {
		DiscountCode.class, DiscountCodes.class,
		DiscountCodeType.class }, schemaFileName = "discounts.proto", schemaFilePath = "proto", schemaPackageName = "discounts")
public interface DiscountsInitializer extends SerializationContextInitializer {

}
