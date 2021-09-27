package com.redhat.challenge.discount.model;

import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

@AutoProtoSchemaBuilder(includeClasses = {
		DiscountCode.class }, schemaFileName = "discounts.proto", schemaFilePath = "proto", schemaPackageName = "discounts")
public interface DiscountsInitializer extends SerializationContextInitializer {

}
