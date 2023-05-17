package com.book.store.project.repository;

import com.book.store.project.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {
}
