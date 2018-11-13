package com.example.demo.rule;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RuleEngineService {

    @Autowired
    private Rules rules;

    private final RulesEngine rulesEngine;

    public RuleEngineService(RulesEngine rulesEngine) {
        this.rulesEngine = rulesEngine;
    }

    public void executeRulesForTarget(String uuid, String target) {
        Facts factss = new Facts();
        factss.put("uuid", uuid);
        factss.put("target", target);
        rulesEngine.fire(rules, factss);

    }


}
