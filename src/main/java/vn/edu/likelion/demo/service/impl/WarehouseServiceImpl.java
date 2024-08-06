package vn.edu.likelion.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.likelion.demo.entity.WarehouseEntity;
import vn.edu.likelion.demo.repository.WarehouseRepo;
import vn.edu.likelion.demo.service.WarehouseService;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseRepo repo;

    @Override
    public Iterable<WarehouseEntity> findAll() {
        return null;
    }

    @Override
    public WarehouseEntity save(WarehouseEntity warehouseEntity) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
