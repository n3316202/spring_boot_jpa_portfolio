package edu.lion.prj.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
public class Posts extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(length = 1200, nullable = false)
    private String content;

    @Column(length = 50, nullable = false)
    private String writer;

    @Column(nullable = false)
    private int hit=0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="users_id")
    private Users users;

}
