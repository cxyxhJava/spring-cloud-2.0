package com.frank.mongoDb.center.service;

import com.frank.mongoDb.center.entity.Customer;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author franyang
 * @date 2018/10/16
 */
@Service
public class MongoDbService {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 多条件   排序  分页查询
     * @param name
     * @param code
     * @param offset
     * @param limit
     * @return
     */
    public List<Customer> queryNamespace(String name, String code, Integer offset, Integer limit) {
        Query query = new Query();
        if (StringUtils.isNotEmpty(name)) {
            query.addCriteria(Criteria.where("name").is(name));
        }
        if (StringUtils.isNotEmpty(code)) {
            query.addCriteria(Criteria.where("code").is(code));
        }
        query.with(new Sort(Sort.Direction.DESC,"creatTime"));
        int skip = (offset - 1) * limit;
        query.skip(skip);// 从那条记录开始
        query.limit(limit);// 取多少条记录
        List<Customer> list = mongoTemplate.find(query, Customer.class);
        return list;
    }


    /**
     * 修改
     * @param customer
     * @return
     */
    public int updateNamespace(Customer customer) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(customer.getId()));
        Update update = new Update();
        if(StringUtils.isNotEmpty(customer.getFirstName())) {
            update.set("firstName",customer.getFirstName());
        }
        mongoTemplate.updateFirst(query, update, Customer.class);
        return 1;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    public int delNamespace(String id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Customer.class);
        return 1;
    }

    /**
     * 单个查询
     * @param id
     * @return
     */
    public Customer queryNamespaceById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        Customer namespace = mongoTemplate.findOne(query,Customer.class);
        return namespace;
    }

}
