package com.zdf.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author hhl
 * @Date 2023年03月06日 22:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person<Int> {
    private Int praised;
    private Int fans;
    private Int attention;
    private Int collect;
}
