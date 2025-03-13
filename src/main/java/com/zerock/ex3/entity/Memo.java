package com.zerock.ex3.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@Table(name = "tbl_memo")
@ToString
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;
    private  String memoText;

}
