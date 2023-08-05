package org.zhaoxuan.common.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Api("分页请求")
public class PageRequest {

//    // @ApiModelProperty("分页起始id，默认不传为-1")
    private long last = -1;
//    // @ApiModelProperty("页号")
    private int page;
    // @ApiModelProperty("页面大小")
    private int size;

}