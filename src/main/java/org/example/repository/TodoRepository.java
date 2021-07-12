package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
            // <데이터 베이스 테이블과 연결될 객체(TodoEntity), 해당객체의 id에 해당하는 필드 타입(Long)>
}
