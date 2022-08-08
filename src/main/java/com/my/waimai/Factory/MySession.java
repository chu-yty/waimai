package com.my.waimai.Factory;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
@Service
public class MySession {
    public static SqlSession mysession;
    static{

        try {
            String config="mybatis-config.xml";
            InputStream stream= Resources.getResourceAsStream(config);
            SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(stream);
            mysession =sessionFactory.openSession();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> T getMapper(Class<T> cls)
    {

        return mysession.getMapper(cls);
    }
    public static void commit()
    {
        mysession.commit();
    }
}
