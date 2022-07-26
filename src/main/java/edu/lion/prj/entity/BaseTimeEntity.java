package edu.lion.prj.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // BaseEntity를 상속한 엔티티들은 아래 필드들을 컬럼으로 인식하게 된다.
@EntityListeners(AuditingEntityListener.class)  // Auditing(자동으로 값 매핑) 기능 추가
public abstract class BaseTimeEntity {

    @CreatedDate
    private LocalDateTime createdTime;

    @LastModifiedDate
    private LocalDateTime lastModifiedTime;
}

/*
각 코드의 어노테이션을 설명하면 아래와 같습니다.

@MappedSuperclass: JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들(createdTime, lastModifiedTime)도 컬럼으로 인식하도록 합니다.
@EntityListeners(AuditingEntityListener.class): BaseTimeEntity 클래스에 Auditing 기능을 포함시킵니다.
@CreatedDate: Entitiy가 최초로 생성되어 저장될 때 시간이 자동으로 저장됩니다.
@LastModifiedDate: 조회한 Entity의 값을 변경할 때 시간이 자동으로 저장됩니다.
*/

/*
    ORM(Object Relationship Mapping) 기술인 JPA는 Application의 Entity와 DB의 Table을 매핑하여 사용합니다.
    DB는 해당 데이터를 누가, 언제 생성 또는 수정했는지 기록하는 것이 꽤나 중요합니다.
    이 데이터들은 많은 테이블에서 사용되기 때문에 Entity에도 필드로 중복되어 들어가고,
    해당 Entity가 생성 또는 수정될 때마다 개발자가 신경 써서 데이터를 입력해줘야 하는 번거로움이 생기게 됩니다.
    이때 사용하는 기술이 Spring Data에서 제공하는 Auditing입니다. Audit는 감독하고 검사하다는 뜻으로,
    해당 데이터를 보고 있다가 생성 또는 수정이 발생하면 자동으로 값을 넣어주는 편리한 기능입니다.
*/