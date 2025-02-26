package com.kk.api;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Map;

/**
 * 供外部调用的接口定义
 *
 * @author limoukun
 * @since 2025/2/19
 **/
public interface IRuleEngineService {

    // Todo 此处的入参还需要进行优化，建议不传map
    String execute(Map<String, Object> mmap) throws JsonProcessingException;
    // "\"scene\":\"raffle-1\",\n  \"roam\":{\n    // \"cost\":110,\n    \"uid\":2,\n    \"credit\":2000\n  }"
}
