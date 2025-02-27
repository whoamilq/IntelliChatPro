package com.chat_blog.java_agi.session;

import com.chat_blog.java_agi.enums.LoginType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: huangpenglong
 * @Date: 2023/4/30 20:52
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginSession {

    private String loginAcct;

    private String password;

    private LoginType loginType;

    private String ip;

    private String socialUid;
}
