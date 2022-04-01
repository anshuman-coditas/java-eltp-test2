package com;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ak");
        EntityManager entityManager= entityManagerFactory.createEntityManager();

        Query query= entityManager.createQuery("select MIN(t.salary) from Teacher t");
        Double res=(Double) query.getSingleResult();
        System.out.println(res);

        Query query1=entityManager.createQuery("select salary from Teacher t where t.tname LIKE 'A%'");
        Double res1=(Double)query1.getSingleResult();
        System.out.println(res1);

        Query query2=entityManager.createQuery("Select t.tname from Teacher t where t.salary between 20000 and 30000");
       List<String> res2=  query2.getResultList();
        System.out.println(res2);

    }


}
