package com.youyd.cache.constant;

/**
 * @description: 定义redis常量
 * @author: LGG
 * @create: 2018-12-25
 */
public class RedisConstant {

	/* 项目名_模块名_业务名 */

	public static final String REDIS_KEY_TOKEN = "USER_TOKEN";      // 登录
	public static final String REDIS_KEY_USER = "USER_LOGIN";      // 登录
	public static final String REDIS_KEY_ARTICLE = "ARTICLE_";  // 文章
	public static final String REDIS_KEY_GATHERING = "GATHERING_HOT";  // 活动
	public static final String REDIS_KEY_SMS = "SMS";  // 短信
	public static final String REDIS_KEY_SEARCH = "EL_SEARCH";  // ElasticSearch
	public static final String REDIS_KEY_QUESTION = "QUESTION";  // 问题


	/*超时时间*/
	// 三个月
	public static final Integer REDIS_TIME_THREE_MONTHS = 60 * 60 * 24 * 30 * 3;
	// 一周
	public static final Integer REDIS_TIME_WEEK = 60 * 60 * 24 * 7;
	// 一天
	public static final Integer REDIS_TIME_DAY = 60 * 60 * 24;
}
