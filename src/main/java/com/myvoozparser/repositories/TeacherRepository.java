package com.myvoozparser.repositories;

import com.myvoozparser.entitys.Teacher;
import com.myvoozparser.entitys.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
