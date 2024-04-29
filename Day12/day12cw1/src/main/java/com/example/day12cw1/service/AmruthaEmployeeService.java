package com.example.day12cw1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day12cw1.model.AmruthaEmployee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Service
public class AmruthaEmployeeService {
    @PersistenceContext
    private EntityManager entityManager;

    public List<AmruthaEmployee> getEmployeesInnerJoin() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<AmruthaEmployee> cq = cb.createQuery(AmruthaEmployee.class);
        Root<AmruthaEmployee> root = cq.from(AmruthaEmployee.class);
        root.fetch("address");
        cq.select(root);

        return entityManager.createQuery(cq).getResultList();
    }

    public List<AmruthaEmployee> getEmployeesLeftOuterJoin() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<AmruthaEmployee> cq = cb.createQuery(AmruthaEmployee.class);
        Root<AmruthaEmployee> root = cq.from(AmruthaEmployee.class);
        root.join("address");
        cq.select(root);

        return entityManager.createQuery(cq).getResultList();
    }
}
