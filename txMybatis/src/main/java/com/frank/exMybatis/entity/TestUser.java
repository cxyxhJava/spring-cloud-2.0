package com.frank.exMybatis.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author franyang
 * @date 2020/9/5
 */
@Data
@Table(name = "test_user")
public class TestUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String value;

    private String nickName;

    private LocalDateTime time;



    enum JAVA_CLOUME{
        ID("id","id"),
        NAME("name","name"),
        ;
        private String dbName;
        private String cloumeName;


        JAVA_CLOUME(){

        }

        JAVA_CLOUME(String dbName,String cloumeName){
            this.dbName = dbName;
            this.cloumeName = cloumeName;
        }
    }

}
