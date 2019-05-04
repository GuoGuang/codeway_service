package com.youyd.annotation;


import java.lang.annotation.*;

/**
 * 操作日志切面
 * @author : LGG
 * @create : 2019年5月4日12:22:22
 **/

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OptLog {

	/* 要执行的操作类型比如：add操作 */
	int operationType() default 0;
	/* 要执行的具体操作比如：添加用户 */
	String operationName() default "";
}
