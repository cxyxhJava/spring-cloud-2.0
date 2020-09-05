package com.frank.exMybatis.vo.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author franyang
 * @date 2020/9/5
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageResp<T> {

    private Integer pageSize;

    private Integer pageNo;

    private Long totalSize;

    private List<T> data;

}
