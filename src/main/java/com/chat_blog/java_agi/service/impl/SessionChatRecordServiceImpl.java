package com.chat_blog.java_agi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chat_blog.java_agi.entity.SessionChatRecordEntity;
import com.chat_blog.java_agi.mapper.SessionChatRecordMapper;
import com.chat_blog.java_agi.service.SessionChatRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: huangpenglong
 * @Date: 2023/3/17 22:12
 */
@Service
public class SessionChatRecordServiceImpl
        extends ServiceImpl<SessionChatRecordMapper, SessionChatRecordEntity>
        implements SessionChatRecordService {

    @Override
    public List<SessionChatRecordEntity> getSessionRecord(Integer sessionId) {
        return baseMapper.selectList(new QueryWrapper<SessionChatRecordEntity>()
                .eq("session_id", sessionId)
                .orderByAsc("session_chat_id")
        );
    }

    @Override
    public void truncateSessionChatRecord(Integer sessionId) {
        baseMapper.delete(new QueryWrapper<SessionChatRecordEntity>().eq("session_id", sessionId));
    }
}
