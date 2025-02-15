package com.kk.api;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Map;

public interface IRuleEngineService {

    String execute(Map<String, Object> mmap) throws JsonProcessingException;
}
