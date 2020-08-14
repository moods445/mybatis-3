package org.apache.ibatis.my;

public class Blog {

  private Long id;
  private String title;
  private String context;


  public Long getId() {
    return id;
  }

  public Blog setId(Long id) {
    this.id = id;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Blog setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getContext() {
    return context;
  }

  public Blog setContext(String context) {
    this.context = context;
    return this;
  }
}
