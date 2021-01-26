package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import test.dao.ServiceDaoImpl;
import test.dto.Service;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService{

    @Autowired
    private ServiceDaoImpl dao;

    @Override
    public List<Service> findAll() {
        return dao.getServiceAll();
    }

    @Override
    public Service find(String id) {
        return null;
    }

    @Override
    public int input(Service service) {
        return dao.insertService(service);
    }

    @Override
    public int remove(String id) {
        return 0;
    }

    @Override
    public int update(Service service) {
        return 0;
    }
}
