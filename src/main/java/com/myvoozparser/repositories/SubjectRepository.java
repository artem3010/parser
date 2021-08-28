package com.myvoozparser.repositories;

import com.myvoozparser.entitys.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
