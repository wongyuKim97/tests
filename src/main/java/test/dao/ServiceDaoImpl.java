package test.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import test.dto.Service;

import java.util.List;

@Repository
public class ServiceDaoImpl implements ServiceDao{
    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<Service> getServiceAll() {
        return sqlSession.selectList("service.selectAll");
    }

    @Override
    public Service getService(String id) {
        return null;
    }

    @Override
    public int insertService(Service service) {
        return sqlSession.insert("service.insertService", service);
    }

    @Override
    public int deleteService(String id) {
        return 0;
    }

    @Override
    public int updateService(Service service) {
        return 0;
    }

}