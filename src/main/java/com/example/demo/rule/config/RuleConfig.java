package com.example.demo.rule.config;

import com.example.demo.rule.Rule01To02;
import com.example.demo.rule.Rule02ATo03;
import com.example.demo.rule.Rule02To05;
import com.example.demo.rule.Rule03To04;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleConfig {

    @Bean
    public RulesEngine ruleEngine() {
        RulesEngine rulesEngine = new DefaultRulesEngine();
        return rulesEngine;
    }

    @Bean
    public Rules rules(
            Rule01To02 rule01To02,
            Rule02ATo03 rule02ATo03,
            Rule02To05 rule02To05,
            Rule03To04 rule03To04
    ) {

        Rules rules = new Rules();
        rules.register(rule01To02);
        rules.register(rule02ATo03);
        rules.register(rule02ATo03);
        rules.register(rule03To04);
        return rules;
    }


}
