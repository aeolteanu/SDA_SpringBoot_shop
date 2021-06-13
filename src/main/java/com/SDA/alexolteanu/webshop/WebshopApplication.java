//package com.SDA.alexolteanu.webshop;
//
//import com.SDA.alexolteanu.webshop.model.Account;
//import com.SDA.alexolteanu.webshop.model.Customer;
//import com.SDA.alexolteanu.webshop.model.Product;
//import com.SDA.alexolteanu.webshop.model.ProductCategory;
//import com.SDA.alexolteanu.webshop.service.CustomerService;
//import com.SDA.alexolteanu.webshop.service.MailService;
//import com.SDA.alexolteanu.webshop.service.OrderService;
//import com.SDA.alexolteanu.webshop.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import java.util.Arrays;
//
//
//@SpringBootApplication
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "com.SDA.alexolteanu.webshop.repository")
//@EntityScan(basePackages = "com.SDA.alexolteanu.webshop.model" )
//public class WebshopApplication implements CommandLineRunner {
//	@Autowired
//	private CustomerService customerService;
//	@Autowired
//	private MailService mailService;
//	@Autowired
//	private ProductService productService;
//	@Autowired
//	private OrderService orderService;
//
//
//	public static void main(String[] args) {
//		SpringApplication.run(WebshopApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.refresh();
//
//		//put here your code
//		Account account1 = new Account();
//		account1.setId(1L);
//		Customer customer1 = new Customer();
//		customerService.addCustomer(account1, customer1);
//
//		customerService.getCustomerAccounts().forEach(account -> {
//			System.out.println(account.toString());
//		});
////		mailService.sendMail("aeolteanu@gmail.com",
////				"client@exempu.com",
////				"Mail subject",
////				"Mail content");
//
//		Product product1 = new Product("ice cream", "ice cream", 1.50, "EUR", ProductCategory.PET_FOOD);
//		productService.save(product1);
//		productService.findAll().forEach(product -> System.out.println(product));
//
//		orderService.save(customer1, Arrays.asList(product1));
//	}
//}
