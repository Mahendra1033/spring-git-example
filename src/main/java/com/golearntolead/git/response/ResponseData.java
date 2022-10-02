package com.golearntolead.git.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseData {

    private long studentId;
    private String studentName;
    private String studentRank;
}