package com.chat_blog.java_agi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chat_blog.java_agi.entity.UserApiKeyEntity;
import com.chat_blog.java_agi.enums.ApiType;
import com.chat_blog.java_agi.mapper.UserApiKeyMapper;
import com.chat_blog.java_agi.service.UserApiKeyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: huangpenglong
 * @Date: 2023/4/20 19:47
 */

@Service
public class UserApiKeyServiceImpl extends ServiceImpl<UserApiKeyMapper, UserApiKeyEntity> implements UserApiKeyService {

    @Resource
    private UserApiKeyMapper userApiKeyMapper;

    @Override
    public UserApiKeyEntity getByUserIdAndType(String userId, ApiType type) {

        return baseMapper.selectOne(new QueryWrapper<UserApiKeyEntity>()
                .eq("user_id", userId)
                .eq("type", type.typeNo));
    }

    @Override
    public void insertOrUpdate(UserApiKeyEntity userApiKeyEntity) {
        userApiKeyMapper.insertOrUpdate(userApiKeyEntity.getUserId(), userApiKeyEntity.getType(), userApiKeyEntity.getApikey());
    }
}
