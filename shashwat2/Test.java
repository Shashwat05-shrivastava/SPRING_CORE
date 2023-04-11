package org.virtusa2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(ShoppingConfig.class);
		/*Employee e=context.getBean("Employee",Employee.class);
		System.out.println(e.geteNo()+"\t"+e.geteName()+"\t"+e.getAddress());*/
		ShoppingList list=context.getBean("shoppingList",ShoppingList.class);
		list.getProducts().forEach(product->{
			System.out.println(product.getpId()+"\t"+product.getName()+"\t"+product.getDecription()+"\t"+product.getPrice());
		});
	}

}
