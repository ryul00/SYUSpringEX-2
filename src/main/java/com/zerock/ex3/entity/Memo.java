package com.zerock.ex3.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@Table(name = "tbl_memo")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(nullable = true, length = 200)
    private  String memoText;

}
