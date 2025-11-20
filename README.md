奶茶店后台管理系统（MilkTea Admin）


基于 Spring Boot + Vue + TypeScript 的线下奶茶店一体化后台运营系统。


本项目构建了一套面向线下奶茶门店的后台管理平台，涵盖商品、套餐、分类、订单、员工账号、数据统计等核心业务，为门店日常运营提供完整的数字化支持。系统以 Spring Boot 为后端框架、Vue + TypeScript 为前端技术栈，实现了清晰稳定的前后端分离架构。


1、后端整体设计与业务重构

在原外卖业务模型的基础上，系统对业务进行了全面重构，使其适配线下奶茶店场景。包括：

（1）奶茶商品模型、规格、配料、图片等结构的重新设计。

（2）套餐、分类、员工、订单等模块的数据表与字段重塑。

（3）订单业务从外卖逻辑切换为“到店点单模式”，对状态流转进行了重新定义。

（4）整体业务流程与数据库模型重新梳理、适配与实现。


2、核心模块实现

项目实现了后台各模块的完整 CRUD 与业务规则处理，包括但不限于：

（1）奶茶管理：商品新增、上架、下架、图片上传、规格与配料维护。

（2）套餐管理：组合商品、套餐内奶茶选择与回显逻辑优化。

（3）分类管理：分类维护、状态变更、数据库联动校验。

（4）订单管理：门店订单状态流转、详情回显、退款/取消逻辑。

（5）员工管理：账号创建、禁用启用、角色权限绑定。

同时，系统实现了统一分页、返回体结构、后端校验、异常处理、图片文件上传等基础能力。

对原项目存在的业务缺陷进行了修复和完善，例如套餐新增时关联奶茶不回显等历史问题。


3、运营统计中心

后台提供运营数据的实时统计，包括：

（1）营业额统计。

（2）日/周/月订单量。

（3）有效订单率。

（4）新增用户趋势。

（5）商品销量 Top10。

所有统计均基于后端动态计算，并提供时间区间查询能力，支持前端图表展示。


<img width="1919" height="906" alt="image" src="https://github.com/user-attachments/assets/b86d7d00-8b88-48b3-afab-0d9e53372b9b" />
<img width="1920" height="903" alt="image" src="https://github.com/user-attachments/assets/ea85cf83-337d-4ae3-b1fe-fa2cca7fa52b" />
<img width="1920" height="903" alt="image" src="https://github.com/user-attachments/assets/7e1f7a11-221f-4f0e-99de-05ce721cb78c" />
<img width="1920" height="903" alt="image" src="https://github.com/user-attachments/assets/e075e68d-faed-4563-9cdc-4fe548123b53" />
<img width="1920" height="903" alt="image" src="https://github.com/user-attachments/assets/a93141b6-2362-41e2-a491-2171c2b07262" />
<img width="1920" height="903" alt="image" src="https://github.com/user-attachments/assets/dcd8ff33-5c48-4846-a3b2-268c13de0442" />
