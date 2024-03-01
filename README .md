
智能ｂｉ项目
1. ｂｉ是什么（商业智能化）
  a. 利用ａｉ自动生成符合要求的图表和结论

需求分析
1. 智能分析：用户输入目标和原始数据类型（图表类型），自动生成图表和分析结论
2. 图表管理（增删改查）
3. 图表生成异步化（消息队列）
4. 对接ａｉ能力

架构图
● 基础流程
  ○ 客户端输入分析诉求和原始数据，向业务后端发送请求
  ○ 业务后端利用ａｉ能力处理用户数据，过滤好，保存到数据库
  ○ 把处理好的数据发送给ａ服务，生成结果返回后端，后端在返回用户
● ![image](https://github.com/jackloveqq/yubi-backend/assets/88128240/af902f30-4b85-47bd-af5c-92d25c2f3478)

问题：ａｉ生成图表时间５０秒，大量用户生成ａｉ服务无法承受
解决：消息队列（用户请求进入队列，ａｉ服务依次处理，避免大量请求压力）
● 优化流程（异步化）
● ![image](https://github.com/jackloveqq/yubi-backend/assets/88128240/cf72356a-aed1-4a93-8aff-9a36cfd0f9f3)
