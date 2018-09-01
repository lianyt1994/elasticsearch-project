# zjutest-project
项目架构：
搜索部分：先根据用户需求从elasticsearch中搜出对应款项，在根据款项id去mysql中搜出全部内容，再将其通过thymeleaf模板引擎回显到前端页面
项目后端基于spring boot，
图片上传七牛云文件系统，
消息中间件采用kafka，
短信服务采用阿里短信云，
邮件采用163的邮件服务器(spring boot提供的框架)，
版本管理工具为maven，
数据库交互采用spring-data-jpa，
安全框架采用spring-security，
缓存采用redis，采用spring boot提供的spring-session将session转换至redis，
json处理工具采用阿里巴巴的fastjson，
支付系统根据支付宝提供的sdk进行编写，采用支付宝提供的沙箱环境进行测试

前端：html,css,js,jquery等
