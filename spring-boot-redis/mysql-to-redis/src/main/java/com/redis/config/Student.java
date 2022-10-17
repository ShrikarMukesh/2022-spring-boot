package com.redis.config;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer stdId;
    private String stdName;
    private Double stdFee;
}
