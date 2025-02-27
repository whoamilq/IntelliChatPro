package com.chat_blog.java_agi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chat_blog.java_agi.entity.SessionChatRecordEntity;

import java.util.List;

/**
 * @Author: huangpenglong
 * @Date: 2023/3/17 22:11
 */
public interface SessionChatRecordService extends IService<SessionChatRecordEntity> {
    /**
     * 获取聊天记录
     * @param sessionId
     * @return
     */
    List<SessionChatRecordEntity> getSessionRecord(Integer sessionId);

    /**
     * 清空聊天记录
     * @param sessionId
     */
    void truncateSessionChatRecord(Integer sessionId);
}
