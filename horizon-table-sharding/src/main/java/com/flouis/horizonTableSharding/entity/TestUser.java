package com.flouis.horizonTableSharding.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

@Data
@TableName(value = "t_user")
public class TestUser {

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    private String theName;
    private Integer age;
    private Integer gender;

}
