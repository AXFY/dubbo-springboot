package com.example.dubboprovider.mapper;


import com.example.dubboprovider.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: zhoulonghui
 * @Date: 2019/1/8 11:41
 */
@Mapper
public interface StudentMapper {



        @Select("SELECT * FROM t_student")
        List<Student> findAll();

}
