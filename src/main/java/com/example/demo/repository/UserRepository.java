package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

    List<User> findAll();
}
