package com.sample;

public class UserDetils {

	public static void main(String[] args) {
		User user = new User(1, "ABC", "Nashik", "abc@gmail.com");

		User user1 = new User();
		user1.setId(2);
		user1.setName("XYZ");
		user1.setCity("Pune");
		user1.setEmail("xyz@gmail.com");

		System.out.println(user1.getId());
		System.out.println(user1.getName());
		System.out.println(user1.getCity());
		System.out.println(user1.getEmail());
	}
}
