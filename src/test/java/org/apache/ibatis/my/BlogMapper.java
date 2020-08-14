package org.apache.ibatis.my;

import org.apache.ibatis.annotations.Select;

public interface BlogMapper {
  Blog selectBlog(long id);

  @Select("select * from blog where title = #{param1} ")
  Blog selectBlogByTitle(String title);
}
