package com.biz.book.persistence;


import org.springframework.data.jpa.repository.JpaRepository;

import com.biz.book.domain.BookVO;

public interface BookRespository extends JpaRepository<BookVO,Long> {



}
