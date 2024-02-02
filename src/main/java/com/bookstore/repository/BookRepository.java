package com.bookstore.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
