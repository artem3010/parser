package com.myvoozparser.repositories;

import com.myvoozparser.entitys.Schedule;
import com.myvoozparser.entitys.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
}
