package com.jpa.test;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entity.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		// create one user- in previous video

//		User userData = new User();
//
//		userData.setName("Sohel Muneer Patvekar");
//		userData.setCity("Islampur");
//		userData.setStatus("I am a java developer..");
//
//		User userInfo = userRepository.save(userData);
//
//		System.out.println(userInfo);

//		create object of user

//		User user1 = new User();
//		user1.setName("Raj");
//		user1.setCity("Karad");
//		user1.setStatus("I am a Architect");
//
//		User user2 = new User();
//		user2.setName("Abhay");
//		user2.setCity("Shirdi");
//		user2.setStatus("I am a python developer");
		
//		Saving single user-
		
//		  User resultUser=userRepository.save(user2);
//		  System.out.println("saved user"+resultUser);
//		  System.out.println("Record inserted successfully..");
		 

//		Saving multiple user-

//		List<User> users = List.of(user1, user2);
//		Iterable<User> result = userRepository.saveAll(users);
//
//		result.forEach(user -> {
//			System.out.println(user);
//		});
//		System.out.println("Done");

//		Get data of user by id-

		/*
		 * Optional<User> optional = userRepository.findById(3); User user =
		 * optional.get(); System.out.println(user);
		 */

//		Update data of user by id-
		/*
		 * Optional<User> optional = userRepository.findById(3); User user =
		 * optional.get(); System.out.println(user);
		 * 
		 * user.setName("Amit"); User result=userRepository.save(user);
		 * 
		 * System.out.println(result);
		 */

//		Get data of Alluser-

//		Old way-
		/*
		 * Iterable<User> itr = userRepository.findAll(); Iterator<User> iterator =
		 * itr.iterator();
		 * 
		 * while(iterator.hasNext()) { User user = iterator.next();
		 * System.out.println(user); }
		 */

//		New Way (lamda function)-

//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(user -> {
//			System.out.println(user);
//		});

//		Deleting data(By id)- 

//		userRepository.deleteById(3);
//		System.out.println("Deleted..");
		
//		Deleting AllById - 
		
//		List<Integer> listId= Arrays.asList(52,53);
//		userRepository.deleteAllById(listId);
//		System.out.println("Deleted successfully..");

//		Deleting AllData-

//		userRepository.deleteAll();
//		System.out.println("deleted..");

		// By Custom finder method-

//		List<User> users = userRepository.findByName("Abhay");
//		users.forEach(e -> System.out.println(e));

//		List<User> users = userRepository.findByNameAndCity("Raj", "Karad");
//		users.forEach(e -> System.out.println(e));

		// By Executing Query-

		/*
		 * List<User> allUser = userRepository.getAllUser();
		 * allUser.forEach(e->System.out.println(e));
		 */

		/*
		 * List<User> byName = userRepository.getByName("Abhay");
		 * byName.forEach(e->System.out.println(e));
		 */

		/*
		 * List<User> byNameAndCity = userRepository.getByNameAndCity("Sohel",
		 * "Islampur"); byNameAndCity.forEach(e->System.out.println(e));
		 */
		
	}

}
