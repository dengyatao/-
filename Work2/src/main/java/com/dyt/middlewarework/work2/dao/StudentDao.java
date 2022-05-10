package com.dyt.middlewarework.work2.dao;

import com.dyt.middlewarework.work2.bean.Student;

import java.util.List;

public interface StudentDao {
    /**
     * 查询出所有的学生信息
     * @return 返回学生列表
     */
    List<Student> list();
}
