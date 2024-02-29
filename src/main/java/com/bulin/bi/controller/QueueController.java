package com.bulin.bi.controller;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 帖子接口
 *

 */
@RestController
@RequestMapping("/queue")
@Slf4j
@Profile({"dev","local"})
public class QueueController {

   @Resource
    private ThreadPoolExecutor threadPoolExecutor;
   @GetMapping("/add")
    public void add(String name){
       CompletableFuture.runAsync(()->{

           log.info("任务执行中"+name+"执行人"+Thread.currentThread().getName());
           try {
               Thread.sleep(600000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }


       },threadPoolExecutor);

   }
   @GetMapping("/get")
    public String get(){
       HashMap<String, Object> objectObjectHashMap = new HashMap<>();
       int size = threadPoolExecutor.getQueue().size();
       objectObjectHashMap.put("队列长度",size);
       long taskCount = threadPoolExecutor.getTaskCount();
       objectObjectHashMap.put("任务总数",taskCount);
       long completedTaskCount = threadPoolExecutor.getCompletedTaskCount();
       objectObjectHashMap.put("已完成总数",completedTaskCount);
       int activeCount = threadPoolExecutor.getActiveCount();
       objectObjectHashMap.put("正在工作的线程数",activeCount);
       return JSONUtil.toJsonStr(objectObjectHashMap);
   }


}
