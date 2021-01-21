package com.frank;

import org.redisson.Redisson;
import org.redisson.api.*;
import org.redisson.config.Config;
import reactor.core.publisher.Mono;

import java.io.File;
import java.io.IOException;

/**
 * @author franyang
 * @date 2020/10/30
 */
public class QuickStart {
    public static void main(String[] args) throws IOException, InterruptedException {

        //1.创建Config的两种方式
        //1.1.直接创建
        Config config = new Config();
//        config.useClusterServers()
//                // use "rediss://" for SSL connection
//                .addNodeAddress("redis://r-bp1xejffcqdtoj8dj8pd.redis.rds.aliyuncs.com:6379")
//                .setPassword("Wekj@2018")
//        ;

        config.useSingleServer()
                .setAddress("redis://r-bp1xejffcqdtoj8dj8pd.redis.rds.aliyuncs.com:6379")
                .setPassword("Wekj@2018")
        ;


        //调用config.toYAML方法可以将一个Config配置实例序列化为一个含有YAML数据类型的字符串
// ... 省略许多其他的设置
        String jsonFormat = config.toYAML();
        System.out.println("jsonFormat:"+jsonFormat);
        //1.2. 使用yaml配置文件读取
        //Config configYaml = Config.fromYAML(new File("config-file.yaml"));

        //2.创建连接器客户端

        //2.1. 同步和异步API
        RedissonClient redisson = Redisson.create(config);

        RAtomicLong longObject = redisson.getAtomicLong("myLong");
        System.out.println("同步执行前:"+longObject.get());
        // 同步执行方式
        longObject.compareAndSet(3, 401);
        System.out.println("同步执行后1:"+longObject.get());
        longObject.set(1);
        System.out.println("同步执行后2:"+longObject.get());
        longObject.compareAndSet(1, 401);
        System.out.println("同步执行后3:"+longObject.get());
        // 异步执行方法
        RFuture<Boolean> result = longObject.compareAndSetAsync(401, 1);
        result.await(1000); //设置超时时间 超时未执行停止
        System.out.println("异步执行前:"+longObject.get());
        Thread.sleep(1000);
        System.out.println("异步执行后:"+longObject.get());


        //2.2. 异步流处理标准的程序接口(Reactive)
        RedissonReactiveClient redissonReactive = Redisson.createReactive(config);
        RAtomicLongReactive redissonReactiveLongObject = redissonReactive.getAtomicLong("myLong");
        // 异步流执行方式
        Mono<Boolean> redissonReactiveResult = redissonReactiveLongObject.compareAndSet(3, 401);

        System.out.println("流处理:"+redissonReactiveLongObject.get());


        //异步流处理

        //2.3. RxJava2规范的接口
        RedissonRxClient redissonRx = Redisson.createRx(config);




        //RedissonRxClient client = Redisson.createRx(config);
        //RAtomicLongRx longObject= client.getAtomicLong("myLong");
//// RxJava2方式
//        Flowable<Boolean result = longObject.compareAndSet(3, 401);
//
//
//        // 3. Get Redis based implementation of java.util.concurrent.ConcurrentMap
//        RMap<String, String> map = redisson.getMap("myMap");
//
//        RMapReactive<String, String> mapReactive = redissonReactive.getMap("myMap");
//
//        RMapRx<String, String> mapRx = redissonRx.getMap("myMap");
//
//        // 4. Get Redis based implementation of java.util.concurrent.locks.Lock
//        RLock lock = redisson.getLock("myLock");
//
//        RLockReactive lockReactive = redissonReactive.getLock("myLock");
//
//        RLockRx lockRx = redissonRx.getLock("myLock");
//
//        // 4. Get Redis based implementation of java.util.concurrent.ExecutorService
//        RExecutorService executor = redisson.getExecutorService("myExecutorService");




    }



}
