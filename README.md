# big-market-rule-engine 大营销平台-规则引擎

> engine/
│
├── domain/                    # 领域层，包含规则引擎的业务逻辑
│   ├── model/                 # 领域模型，包含规则、策略等核心业务模型
│   ├── service/               # 领域服务，处理业务规则和逻辑
│   ├── repository/            # 领域仓储，处理规则数据存储
│   ├── event/                 # 领域事件，传递领域内部事件
│   └── exception/             # 领域异常，定义领域相关异常处理
│
├── application/               # 应用层，负责协调领域服务
│   ├── service/               # 应用服务，管理与外部系统的交互
│   └── dto/                   # 数据传输对象，定义接口与领域间的数据传输
│
├── infrastructure/            # 基础设施层，外部服务的实现
│   ├── repository/            # 数据存取实现，如数据库、缓存等
│   ├── messaging/             # 消息队列相关实现（如 RabbitMQ、Kafka）
│   └── rule-engine/           # 规则引擎的具体实现与优化，如 Rete 算法、缓存策略等
│
├── api/                 # 接口层，提供对外的 API 接口
│   ├── controller/            # 接口控制器，暴露 REST API
│   └── config/                # 配置相关（如 API 配置、认证配置等）
│
└── types/                    # 公共模块（跨层共用的工具类、常量、异常处理等）
