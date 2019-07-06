package org.nil.spring.drools.api;

import java.util.List;

import lombok.Data;

@Data
public class Order {

	private String name;
	private String cardType;
	private int discount;
	private int price;
	private List<Product> products;
}
