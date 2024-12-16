package com.chat_blog.java_agi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chat_blog.java_agi.entity.UserLoginRecord;
import com.chat_blog.java_agi.mapper.UserLoginRecordMapper;
import com.chat_blog.java_agi.service.UserLoginRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: huangpenglong
 * @Date: 2023/4/26 17:10
 */

@Service
@Slf4j
public class UserLoginRecordServiceImpl
        extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord>
        implements UserLoginRecordService {


}
