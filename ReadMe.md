# lysy

----

### 目录模块
~~~~
communicate：     // 社区
      controller;   // 接口
      entity;       // 抽象类
      service;      // 服务层
      mapper;       // 数据库操作
community:       // 社区
index：          // 登陆注册
learn：          // 学习
main：           // 我的
test：           //测试
~~~~

### 字段名称
 * User用户
 
  | 字段名称| 字段详情 |
  | ---- | ---- |
  | userName | 用户姓名 |
  | userId | ID:用来判定身份 |
  | type | 身份判定 |
  |password | 登陆密码 |
  
 * Diary发表日记
 
  | 字段名称| 字段详情 |
   | ---- | ---- |
   | title | 标题 |
   |content | 内容 |
   |image| 图片|
   |date|日期|
   |com_id|评论人的id|
   |gra_id|点赞人的id|
   |com_num|评论人的数量|
   |gra_num | 点赞人的数量|
   
* Comment评论

 | 字段名称| 字段详情 |
  | ---- | ---- |
  | commentId| 评论人的id|
  | com_content| 评论内容|
  |com_date|评论日期|