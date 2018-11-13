package com.example.demo.rule;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class RuleTest {

    @InjectMocks
    private RuleEngineService ruleEngineService;

    @Before
    public void init() {

        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void foo() throws Exception {

        //When
        ruleEngineService.executeRulesForTarget("uuid", "1234");

    }



}