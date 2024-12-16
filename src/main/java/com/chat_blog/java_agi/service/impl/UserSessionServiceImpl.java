package com.chat_blog.java_agi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chat_blog.java_agi.entity.UserSessionEntity;
import com.chat_blog.java_agi.enums.SessionType;
import com.chat_blog.java_agi.mapper.UserSessionMapper;
import com.chat_blog.java_agi.service.UserSessionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: huangpenglong
 * @Date: 2023/3/17 15:34
 */

@Service
public class UserSessionServiceImpl extends ServiceImpl<UserSessionMapper, UserSessionEntity> implements UserSessionService {

    @Override
    public UserSessionEntity save(String userId, String sessionName, SessionType sessionType) {
        UserSessionEntity userSession = new UserSessionEntity(userId, sessionName, sessionType.type);
        baseMapper.insert(userSession);
        return userSession;
    }

    @Override
    public List<UserSessionEntity> getSessionList(String userId, SessionType sessionType) {
        return baseMapper.selectList(new QueryWrapper<UserSessionEntity>()
                .eq("user_id", userId)
                .eq("type", sessionType.type));
    }
}
