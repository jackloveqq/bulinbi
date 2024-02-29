package com.bulin.bi.bizmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

//public class BiInit {
////    用于创建测试成语用到的交换机和队列
//    public static void main(String[] args) {
////    1.创建建工厂
//        ConnectionFactory factory = new ConnectionFactory();
//        factory.setHost("192.168.48.128");
//        factory.setUsername("admin");
//        factory.setPassword("admin");
//// 2.创建连接
//        try {
//            Connection connection = factory.newConnection();
//            Channel channel = connection.createChannel();
//            String EXCHANGE_NAME = BiMqConstant.BI_EXCHANGE_NAME;
//            channel.exchangeDeclare(EXCHANGE_NAME, "direct");
//            String queueName =  BiMqConstant.BI_QUEUE_NAME;
//            channel.queueDeclare(queueName, true, false, false, null);
//            channel.queueBind(queueName, EXCHANGE_NAME, BiMqConstant.BI_ROUTING_KEY);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//    public static void extracted() {
//        //1.创建建工厂
//        ConnectionFactory factory = new ConnectionFactory();
//        factory.setHost("192.168.48.128");
//        factory.setUsername("bulin");
//        factory.setPassword("123456");
//// 2.创建连接
//        try {
//            Connection connection = factory.newConnection();
//            Channel channel = connection.createChannel();
//            String EXCHANGE_NAME = BiMqConstant.BI_EXCHANGE_NAME;
//            channel.exchangeDeclare(EXCHANGE_NAME, "direct");
//            String queueName =  BiMqConstant.BI_QUEUE_NAME;
//            channel.queueDeclare(queueName, true, false, false, null);
//            channel.queueBind(queueName, EXCHANGE_NAME, BiMqConstant.BI_ROUTING_KEY);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

