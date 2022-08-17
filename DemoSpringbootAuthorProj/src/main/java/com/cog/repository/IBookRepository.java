package com.cog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cog.modal.Book;

public interface IBookRepository extends JpaRepository<Book, Integer> {


}
