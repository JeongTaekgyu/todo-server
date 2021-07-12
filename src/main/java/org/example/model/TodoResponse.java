package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoResponse {
    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    // 필드들을 추가해주고나서
    // TodoEntity를 파라미터로 받는 생성자로 추가한다.
    public TodoResponse(TodoEntity todoEntity){
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.order = todoEntity.getOrder();
        this.completed = todoEntity.getCompleted();

        // 이렇게 하드코딩하면 좋지않음
        // base url과 port가 바뀔때마다 코드를 재수정하고 배포해야하는 작업을 거치기 때문에
        // 보통은 config나 property로 해준다 하지만 지금 그렇게하면 배보다 배꼽이 커지기 때문에 일단 하드코딩했다.
        this.url = "http://localhost:8080/" + this.id;
    }
}
/*
    jpa, repository의 개념과 용도
    repository는 퍼시스턴트 레이어라고 하는 데이터베이스와 데이터를 주고받기 위한 인터페이스를 정의한 부분
    여기서는 실재 데이터를 저장하고 있는 클래스가 아니라 데이터를 주고받는 방식인 인터페이스방식이다.
 */
