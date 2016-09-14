package com.easyman.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by eldorado on 16-9-14.
 */
public class MyBatisUtil {
    private final static String MYBATICS_CONFIG_URI = "mybatis/config/mybatis-config.xml";
    private static SqlSessionFactory factory;
    static {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream(MYBATICS_CONFIG_URI);
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(is != null) {
                    is.close();;
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static SqlSessionFactory getFactory() {
        return factory;
    }
}
