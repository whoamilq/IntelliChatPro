package com.chat_blog.java_agi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddSessionRequest {
    @JsonProperty("user_id")
    private String userId;

    @Length(max = 100, message = "会话名不能超过100字！")
    @JsonProperty("session_name")
    private String sessionName;

    @JsonProperty("type")
    private Integer type;
}
