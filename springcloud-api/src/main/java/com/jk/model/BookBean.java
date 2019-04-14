/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BookBean
 * Author:   Administrator
 * Date:     2019/4/13 10:55
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model;

/**
 *
 * @author lvdl
 * @create 2019/4/13
 * @since 1.0.0
 */
public class BookBean {

    private Integer bookId;

    private String  bookName;

    private Double  bookPrice;

    private String bookDate;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookDate=" + bookDate +
                '}';
    }
}