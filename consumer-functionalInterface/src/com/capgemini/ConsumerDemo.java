package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Urmi");
		names.add("Juin");
		names.add("Manami");
		names.add("Pramita");
		names.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name);
				
			}
		});
		System.out.println("Using lambda expression:");
		names.forEach((String name)->System.out.println(name));
		
	}

}
