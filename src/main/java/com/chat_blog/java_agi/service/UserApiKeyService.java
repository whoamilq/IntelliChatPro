package com.chat_blog.java_agi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chat_blog.java_agi.entity.UserApiKeyEntity;
import com.chat_blog.java_agi.enums.ApiType;


/**
 * @Author: huangpenglong
 * @Date: 2023/4/20 19:46
 */
public interface UserApiKeyService extends IService<UserApiKeyEntity> {

    /**
     * 获取用户的ApiKey
     * @param userId
     * @param type
     * @return
     */
    UserApiKeyEntity getByUserIdAndType(String userId, ApiType type);

    /**
     * 根据唯一键 userId 和 type来决定插入还是更新数据
     * @param userApiKeyEntity
     */
    void insertOrUpdate(UserApiKeyEntity userApiKeyEntity);
}
