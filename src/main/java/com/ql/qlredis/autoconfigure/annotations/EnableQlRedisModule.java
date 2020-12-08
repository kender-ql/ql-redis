package com.ql.qlredis.autoconfigure.annotations;

import com.ql.qlredis.autoconfigure.configure.QlRedisConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * EnableQlRedis：sample使用这个注解，就能执行redis的QlRedisConfiguration中的自动扫描（ComponentScan）
 *
 * Documented功能：指明修饰的注解，可以被例如javadoc此类的工具文档化，只负责标记，没有成员取值。
 * @author jiang.he
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Documented
@Import({QlRedisConfiguration.class})
public @interface EnableQlRedisModule {
}
