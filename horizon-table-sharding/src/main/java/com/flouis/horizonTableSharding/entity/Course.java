package com.flouis.horizonTableSharding.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

@Data
public class Course {

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    private String csName;
    private Integer state;

}