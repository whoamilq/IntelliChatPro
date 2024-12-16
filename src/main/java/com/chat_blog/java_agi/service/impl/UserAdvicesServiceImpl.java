package com.chat_blog.java_agi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chat_blog.java_agi.entity.UserAdvicesEntity;
import com.chat_blog.java_agi.mapper.UserAdvicesMapper;
import com.chat_blog.java_agi.service.UserAdvicesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserAdvicesServiceImpl extends ServiceImpl<UserAdvicesMapper, UserAdvicesEntity>
        implements UserAdvicesService {
}
