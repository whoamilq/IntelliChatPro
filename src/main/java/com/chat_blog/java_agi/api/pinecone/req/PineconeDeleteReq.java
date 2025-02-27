package com.chat_blog.java_agi.api.pinecone.req;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author zxw
 * @Desriiption: 向量库删除请求
 */
@Builder
@Data
public class PineconeDeleteReq {

    private List<String> ids;

    private boolean deleteAll;

    private String namespace;

    private Map<String, String> filter;

}
