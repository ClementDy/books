package com.books.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


@Getter
@Setter
public class Reading {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private int bookId;

    private Date startDate;

    private Date endDate;

}
