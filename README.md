# test_Junit5
practice for junit5

# 介绍
该repo是junit5的练习repo，含junit5的基本特性和用法：
- junit5 常用注解
- test case级别
- test suite级别
    - @RunWith(JUnitPlatform.class)
    - @SelectPackages({packageName1, packageName2})
    - @IncludePackages({packageName1, packageName2})
    - @SelectClasses({测试类名1.class, 测试类名2.class})
    - @IncludeTags(tagName)
    - @ExcludeTags(tagName)
- test fixture的基本用法
    - @Before、@After、@BeforeAll、@AfterAll
    - 测试子类继承测试基类
- 并发测试 parallel test
    - /src/main/resources下创建配置文件junit-platform.properties
    - [官方文档设置](https://junit.org/junit5/docs/current/user-guide/#writing-tests-parallel-execution)
