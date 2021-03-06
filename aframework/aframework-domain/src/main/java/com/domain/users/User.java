/******************************************************************
 *
 *    Java Lib For Web, Powered By Alvis.Yu.
 *
 *    Copyright (c) 2001-2017 Alvis.Yu Co.,Ltd
 *    http://yu.alvis.com/
 *
 *    Package:     domain.users
 *
 *    Filename:    customer.java
 *
 *    Description: customer
 *
 *    Copyright:   Copyright (c) 2001-2017
 *
 *    Company:     Alvis.Yu Co.,Ltd
 *
 *    @author:     dell
 *
 *    @version:    1.0.0
 *
 *    Create at:   Jul 18, 2017 3:24:08 PM
 *
 *    Revision:
 *
 *    Jul 18, 2017 3:24:08 PM
 *        - first revision
 *
 *****************************************************************/
package com.domain.users;

import java.sql.Timestamp;

import com.domain.base.BaseEntity;





/** 
* @author 
* @version 创建时间：Jul 18, 2017 3:24:08 PM 
* 类说明 
*/
/**
 * @ClassName user
 * @Description user
 * @author Alvis
 * @Date Jul 18, 2017 3:24:08 PM
 * @version 1.0.0
 */
public class User extends BaseEntity {

    private Integer id;
 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Timestamp getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Timestamp lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    private Integer age;

    private Timestamp lastActiveTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    private String user_name;
    
    private String password;
    
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
