package org.zhaoxuan.pojo.request.user;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
// @ApiModel("批量添加请求")
public class BatchAddRequest<T> {

    // @ApiModelProperty("请求数据")
    private List<T> list;

}