/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.HibernateUtil;
import entity.Courses;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author
 * Администратор
 */
public class CourseService {
    
     public Courses getCourseByName(String courseNameRU) {
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        Courses course = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Courses where courseNameRU='"+courseNameRU+"'");
            course = (Courses)query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return course;
    }
    public Courses getCourseById(long courseID) {
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        Courses course = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Courses where courseId='"+courseID+"'");
            course = (Courses)query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return course;
    }
    
    public List<Courses> getListOfCourses(){
        List<Courses> list = new ArrayList<Courses>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;        
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Courses").list();                        
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
    
    
    
}
