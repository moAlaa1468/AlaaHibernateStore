package moh.amer.alaahibernatestore.operations;


import moh.amer.alaahibernatestore.common.HibernateDBManager;
import moh.amer.alaahibernatestore.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.swing.*;

public class testMain {

    public static void main(String[] args) {
        Session commonRepo = HibernateDBManager.getSession();
        try {
            commonRepo.beginTransaction();


            Category category = new Category();
            category.setId(100);
            category.setName("First Hibernate name ");
            category.setDescription("This is Good running files uaAmer ");

            Object savedCategory = commonRepo.save(category);
            if (savedCategory == null) {
                System.out.println("Your class doesn't created in database usAmer ");
            }
            commonRepo.getTransaction().commit();
        } catch (ExceptionInInitializerError ex) {
            System.out.println("There is a problem in the main Method you need to Solve it Now ");
            ex.getMessage();
            commonRepo.getTransaction().rollback();
            ;
        }
    }
}
