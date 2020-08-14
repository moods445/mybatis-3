package org.apache.ibatis.my;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class ProcessTest {

  @Test
  public void test() throws IOException {

    String resource = "org/apache/ibatis/my/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession = sqlSessionFactory.openSession();

    BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

    blogMapper.selectBlog(1);
//    blogMapper.selectBlogByTitle("11");
  }
}
