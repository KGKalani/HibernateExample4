package main.java.com.dao.impl;

import main.java.com.dao.AddressDao;
import main.java.com.model.Address;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * Created by gayathri on 6/19/17.
 */
public class AddressDaoImpl implements AddressDao{
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void saveAddress(Address address) {
        hibernateTemplate.save(address);
    }
}
