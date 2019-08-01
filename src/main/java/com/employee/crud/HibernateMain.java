package com.employee.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setId(5);
		employee.setName("Hinal");
				
		Address address = new Address();
		address.setId(1);
		address.setStreet("Chala Daman-Road");
		address.setCity("Vapi");
		address.setPincode("396191");
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setName("Activa");
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setName("Amaaze");
		Vehicle vehicle3 = new Vehicle();
		vehicle3.setName("Tavera");
		
		Mobile mobile1 = new Mobile();
		mobile1.setId(6);
		mobile1.setBrand("Nokia");
		mobile1.setModel("C202");
		
		Mobile mobile2 = new Mobile();
		
		mobile2.setBrand("Vivo");
		mobile2.setModel("1713");
		
		employee.setAddress(address);
		
		employee.getMobile().add(mobile1);
		employee.getMobile().add(mobile2);
		mobile1.setEmployee(employee);
		mobile2.setEmployee(employee);
	
		employee.getVehicle().add(vehicle1);
		employee.getVehicle().add(vehicle2);
		employee.getVehicle().add(vehicle3);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		/*session.save(address);
		session.save(vehicle1);
		session.save(vehicle2);
		session.save(vehicle3);
		session.save(employee);
		session.save(mobile1);
		session.save(mobile2);
		*/
		
		//session.update(address);
		
		//session.delete(mobile1);
	
		Employee emp = session.get(Employee.class, (long)5);
		System.out.println(emp.toString());
		session.getTransaction().commit();
		session.close();
	}

}
