package com.ibole.tweets.dao;


import com.ibole.pojo.tweets.Tweets;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * dao
 **/

public interface TweetsDao extends JpaRepository<Tweets, Long> {
    /**
     * 根据上级ID查询吐槽列表（分页）
     * @param parentId
     * @return
     */
//	Tweets findTweetsByParentid(String parentId);

    /**
     * 更新 点赞数,回复数,分享数或者评论数 的通用更新方法
     */
//	void updateTweetsStatus(Tweets tweets);
}
