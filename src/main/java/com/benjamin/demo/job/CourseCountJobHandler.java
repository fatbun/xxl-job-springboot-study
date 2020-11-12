/*
 * Copyright(C) 2015-2020 聚顶朝元 Rights Reserved.
 */
package com.benjamin.demo.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @ClassName CourseCountJobHandler
 * @Description 同步 课程统计页面
 * @Author Zaki
 * @Date 2020/7/17 11:58 下午
 * @ModifyDate 2020/7/17 11:58 下午
 * @Version 1.0
 */
@Component
public class CourseCountJobHandler {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());


    @XxlJob("demoJobHandler")
    public ReturnT<String> execute(String param) {
        XxlJobLogger.log("hello world.");
        System.out.println("job is executing...");

        return ReturnT.SUCCESS;
    }
}
