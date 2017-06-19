package main.java.com.service.impl;

import main.java.com.dao.AddressDao;
import main.java.com.model.Address;
import main.java.com.service.AddressService;

/**
 * Created by gayathri on 6/19/17.
 */
public class AddressServiceImpl implements AddressService {

    private AddressDao addressDao;

    public void setAddressDao(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    @Override
    public void saveAddress(Address address) {
        addressDao.saveAddress(address);
    }
}
