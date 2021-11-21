package com.flouis.horizonTableSharding.vo;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TestUserSearchVo extends BaseSearchVo {

    private String theName;

    private Integer age;

    private Integer gender;

    public void preHandle() {
        this.setTheName(StrUtil.isBlank(this.theName) ? null : this.theName);
    }

}
