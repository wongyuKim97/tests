package test.service;

import test.dto.Service;

import java.util.List;

public interface ServiceService {
    public List<Service> findAll();
    public Service find(String id);
    public int input(Service service);
    public int remove(String id);
    public int update(Service service);
}