package vn.edu.likelion.demo.service;

import vn.edu.likelion.demo.entity.ProductEntity;

import java.util.Optional;

public interface ProductService extends BaseService<ProductEntity> {
    Iterable<ProductEntity> findAllByIsDeleted(int num);
}
