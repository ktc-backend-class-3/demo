package vn.edu.likelion.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.likelion.demo.entity.ProductEntity;
import vn.edu.likelion.demo.repository.ProductRepo;
import vn.edu.likelion.demo.service.ProductService;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo repo;

    @Override
    public Iterable<ProductEntity> findAll() {
        return repo.findAll();
    }

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        return repo.save(productEntity);
    }

    @Override
    public void remove(int id) {
        Optional<ProductEntity> productEntity = repo.findById(id);
        productEntity.get().setIsDeleted(1);
        repo.save(productEntity.get());
        //repo.deletedeleteById(id);
    }

    @Override
    public Iterable<ProductEntity> findAllByIsDeleted(int num) {
        return repo.findAllByIsDeleted(num);
    }
}
