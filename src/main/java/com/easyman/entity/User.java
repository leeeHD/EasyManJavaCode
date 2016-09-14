package com.easyman.entity;

import lombok.Data;

/**
 * Created by eldorado on 16-9-14.
 *
 * user basic information, if there are other information
 * add another entity and data table
 */
@Data
public class User {
    private Integer user_id;
    private String email_id;
    private String password;
    private String first_name;
    private String last_name;
}
