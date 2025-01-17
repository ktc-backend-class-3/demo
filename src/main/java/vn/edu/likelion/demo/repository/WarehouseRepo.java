package vn.edu.likelion.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.likelion.demo.entity.WarehouseEntity;

@Repository
public interface WarehouseRepo extends JpaRepository<WarehouseEntity, Integer> {
}
