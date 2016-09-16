/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Courselections;
import entity.Courses;
import entity.HibernateUtil;
import entity.Lectionmainmaterials;
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
public class CourseLectionsService {
    
    public Courselections getCourseLectionById(int courseLectionID){
        Courselections lm = new Courselections();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        try{
            tx = session.getTransaction();
            tx.begin();
            System.out.println(courseLectionID);
            Query query = session.createQuery("from Courselections where lectionID='"+courseLectionID+"'");
            lm = (Courselections)query.uniqueResult();
            tx.commit();
        }catch(Exception e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return lm;
    }
    
    public Lectionmainmaterials getLectionMainMaterial(int courseLectionID){
        Lectionmainmaterials lmm = new Lectionmainmaterials();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        try{
            tx = session.getTransaction();
            tx.begin();
            System.out.println("in the getLectionMainMaterial = "+courseLectionID);
            Query query = session.createQuery("from Lectionmainmaterials where lectionID='"+courseLectionID+"'");
            lmm = (Lectionmainmaterials)query.uniqueResult();
            tx.commit();
        }catch(Exception e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        lmm.getLectionPdfru();
        return lmm;        
    }
    
    
    
    public List<Courselections> getCourseLectionsByCourseId(long courseID){
        
        List<Courselections> list = new ArrayList<Courselections>();
        
        return list;
    }
    
    public List<Courselections> getListOfCourseLectionsByCourse(Courses course){
        List<Courselections> list = new ArrayList<Courselections>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;        
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Courselections where courseID='"+course.getCourseId()+"'").list();                        
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
