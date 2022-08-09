import com.my.waimai.Factory.MySession;
import com.my.waimai.entity.Employee;
import com.my.waimai.mapper.yonghuMapper;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;

import java.io.IOException;
import java.io.InputStream;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class test {
    @Test
    public static void main(String[] args) throws IOException {




            String config="mybatis-config.xml";
            InputStream stream= Resources.getResourceAsStream(config);
            SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(stream);
            SqlSession session = sessionFactory.openSession();

        List<Employee> employees  = MySession.getMapper(yonghuMapper.class).selectAll(2, 2,null);
        System.out.println(employees);


        //初始密码123456
////            String password= DigestUtils.md5DigestAsHex("123456".getBytes());
////            Employee employee =new Employee();
////            employee.setPassword(password);
////            employee.setUsername("忆童颜");
////            employee.setPhone("12345678944");
////            employee.setSex("1");
////            employee.setIdNumber("411445646546545461");
////            employee.setName("Mr.liang");
////            long a=2;
//
//        employee.setId(a);
//            employee.setCreateTime(new Date(System.currentTimeMillis()));
//            employee.setUpdateTime(new Date(System.currentTimeMillis()));
//            employee.setCreateUser(1l);
//            employee.setUpdateUser(1l);
//            mapper.addstaff(employee);
//
//            session.commit();
//            session.close();
        }

}
