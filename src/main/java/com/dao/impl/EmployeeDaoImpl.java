package main.java.com.dao.impl;

import main.java.com.dao.EmployeeDao;
import main.java.com.model.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Gayathri on 6/17/2017.
 */
public class EmployeeDaoImpl implements EmployeeDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void saveEmployee(Employee employee){
        hibernateTemplate.save(employee);
    }

    public List<Employee> fetchEmployeeList(Employee employee){
        List returnList = hibernateTemplate.executeFind(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.getNamedQuery("fetchEmployee")
                        .setParameter("id",employee.getId());
                return query.list();
            }
        });
        System.out.println(returnList.size());

        return returnList;
    }
}
