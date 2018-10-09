package com.capgemini;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductCollectTest {

	public static void main(String[] args) {
		List<Product> productList=Arrays.asList(new Product("Book",200),
				new Product("Mobile",5000),new Product("Chair",500),
				new Product("table",500),new Product("curtains",500));
		
		System.out.println("Stream to collection:");
		List<String> productNames=productList.stream().map(Product::getName).collect(Collectors.toList());
		productNames.forEach(System.out::println);
		
		
		System.out.println("Reduce to String:");
		System.out.println(productList.stream().map(Product::getName).collect(Collectors.joining(",", "[" ,"]")));
		
		
		System.out.println("Average price="+productList.stream().collect(Collectors.summarizingInt(Product::getPrice)));
		
		Map<Boolean,List<Product>> collect=productList.stream().collect(Collectors.partitioningBy(p->p.getPrice()>300));
		collect.forEach((k,v)->
		{
			System.out.println(k);
			System.out.println(v);
		});
		
		System.out.println(productList.stream().distinct().count());
		
		
		
		

	}

}
