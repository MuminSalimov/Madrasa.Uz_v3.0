/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.HibernateUtil;
import entity.User;
import entity.Userlearningcourses;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author
 * Администратор
 */
public class EnrolToCourseService {

    public EnrolToCourseService() {
    }
    
    public boolean enrolToCourse(Integer courseID, User user){
        boolean isEnroled = false;
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        Userlearningcourses ulc = new Userlearningcourses();
        ulc.setUser(user);
        ulc.setLearningCourseID(courseID);
        
                
        if(isUserAlreadyEnrolled(courseID, user)){
            return false;
        }else{
            try{
                tx = session.getTransaction();
                tx.begin();
                //session.saveOrUpdate(ulc);
                String queryString = "insert userlearningcourses(userEmail, learningCourseID, lectioinID) values('"+
                        user.getEmail()+ "'," + courseID.toString() + ",1)";
                Query q = session.createSQLQuery(queryString);
                q.executeUpdate();
                tx.commit();
            }catch(Exception e){
                if(tx != null)
                    tx.rollback();
                e.printStackTrace();
            }finally{
                session.close();
            }            
        }
        isEnroled = true;
        return isEnroled;
    }

    public boolean isUserAlreadyEnrolled(Integer courseID,User user) {
        boolean isAlreadyEnrolled = false;
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        try{
            tx = session.getTransaction();
            tx.begin();
            System.out.println("user email = " + user.getEmail());
//            Query q = session.createQuery("from Userlearningcourses where userEmail= '"+
//                    user.getEmail()+"' and learningCourseID = '"+courseID.toString()+"'");
            Query q = session.createQuery("from Userlearningcourses where learningCourseID = '"+courseID.toString()
                    +"' and userEmail ='" + user.getEmail()+"'");
            ArrayList<Userlearningcourses> ulc = (ArrayList<Userlearningcourses>) q.list();
//            for(Userlearningcourses u : ulc)
//            System.out.println("user "+ u.getUser().getEmail());
            tx.commit();
            if(ulc != null) isAlreadyEnrolled = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return isAlreadyEnrolled;        
    }
    
}
