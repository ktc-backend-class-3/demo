package vn.edu.likelion.demo.service;

public interface BaseService<T> {
    Iterable<T> findAll(); // read
    T save(T t); // create + update
    void remove(int id); // delete
}
