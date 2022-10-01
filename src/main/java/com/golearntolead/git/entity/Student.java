package com.golearntolead.git.entity;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Student {

    private long studentId;
    private String studentName;
    private String studentRank;

}
