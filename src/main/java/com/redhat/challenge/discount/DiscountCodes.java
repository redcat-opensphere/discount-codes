package com.redhat.challenge.discount;

import java.util.List;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import com.redhat.challenge.discount.model.DiscountCode;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class DiscountCodes {

	@ProtoField(number = 1)
	List<DiscountCode> discountCodesList;

	@ProtoField(number = 2, defaultValue = "0")
	long totalCount;

   public DiscountCodes() {
   }

	@ProtoFactory
   public DiscountCodes(List<DiscountCode> discountCodesList, long totalCount) {
      this.discountCodesList = discountCodesList;
      this.totalCount = totalCount;
   }

   public List<DiscountCode> getDiscountCodesList() {
      return discountCodesList;
   }

   public void setDiscountCodesList(List<DiscountCode> discountCodesList) {
      this.discountCodesList = discountCodesList;
   }

   public long getTotalCount() {
      return totalCount;
   }

   public void setTotalCount(long totalCount) {
      this.totalCount = totalCount;
   }
}
