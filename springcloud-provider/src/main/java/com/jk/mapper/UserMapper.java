package com.jk.mapper;

import com.jk.model.BookBean;
import com.jk.model.TreeBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<TreeBean> queryTreeById(int pid);

    int findBookCount();

    List<BookBean> findBookPage(@Param("start") int start, @Param("rows") Integer rows);

    void addBook(BookBean bookBean);

    BookBean findBookById(Integer bookId);

    void updateBook(BookBean bookBean);

    void deleteById(Integer bookId);
}
