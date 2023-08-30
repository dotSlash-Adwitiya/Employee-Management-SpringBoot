package com.adwitiya.springboot.crudapp.DAO;
import com.adwitiya.springboot.crudapp.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.lang.reflect.Type;

@Repository
public class EmployeeDAOImple implements EmployeeDAO{
    private EntityManager entityManager;
    EmployeeDAOImple(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);

        return query.getResultList();
    }

    @Override
    public Employee findById(int id) {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee where id=:ID", Employee.class);
        //* Set parameter from "id" in method argument to the query where keyword = "ID"
        query.setParameter("ID", id);

        //* The typecasting when we use TypedQuery is done automatically
        //* So, in this case, typecasting only causes redundancy but for ex I've written it.
        Employee emp =query.getSingleResult();

        return emp;
    }
}
