package com.wxb.springbootwxbshardingjdbc.entity;

import lombok.Data;

/**
 * @author wangxianbing
 * @date 2021-09-16 15:25:52
 */
@Data
public class course {
    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;
}
