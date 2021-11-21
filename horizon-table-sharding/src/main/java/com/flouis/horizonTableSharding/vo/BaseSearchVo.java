package com.flouis.horizonTableSharding.vo;

import lombok.Data;

@Data
public class BaseSearchVo {

    private Long id;

    private Integer curPage = 1;
    private Integer pageSize = 10000;

}
