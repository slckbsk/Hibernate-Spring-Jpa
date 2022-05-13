package com.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			
//			  READ OKUMA ve LİSTELEME
//			  
//			  QUERYLER 
//			  from City c where c.countryCode='USA' OR c.countryCode='TUR' 
//			  from City c where c.name LIKE 'kar%' 
//			  From City c ORDER BY c.name DESC
//			  ASC-Ascending DESC- Descending
//			  

		  List<City> cities =
		  session.createQuery("from City c where c.name='Düzce'").getResultList(); 
		  
			  for (City city:cities) {
			  System.out.println(city.getName()); 
			  }
			  
//			  Burda STRING nesnesi cünkü tablodan bir kolon değil kendi istediğimiz stringler
//			  
//			  List<String> countrycode =
//			  session.createQuery("From City c ORDER BY c.name DESC").getResultList();
//			  
//			  for (String city:countrycode) { System.out.println(city); }
//			  
//			  
//			 INSERT EKLEME
//			  
//			  City city = new City(); city.setName("Düzce 5"); 
//			  city.setCountryCode("TUR");
//			  city.setDistrict("Karadeniz"); 
//			  city.setPopulation(123000);
//			  session.save(city);
//			  System.out.println("Şehir eklendi");
//			  
//			  
//			 UPDATE GÜNCELLEME
//			  
//			  City city = session.get(City.class, 4093);
//			  System.out.println(city.getName());
//			  city.setPopulation(222000);
//			  session.save(city); 
//			  System.out.println("Şehir güncellendi");
//			 
//			 DELETE SİLME
//
//			  City city = session.get(City.class, 4093);
//		          System.out.println(city.getName());
//			  session.delete(city);
//                        System.out.println("Şehir silindi");
			
			
			session.getTransaction().commit();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

}
