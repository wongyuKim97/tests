package test.dao;

import test.dto.Service;

import java.util.List;

public interface ServiceDao {
    public List<Service> getServiceAll();
    public Service getService(String id);
    public int insertService(Service service);
    public int deleteService(String id);
    public int updateService(Service service);
}
