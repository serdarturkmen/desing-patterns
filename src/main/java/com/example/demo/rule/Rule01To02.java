package com.example.demo.rule;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.core.BasicRule;
import org.springframework.stereotype.Component;

@Component
public class Rule01To02 extends BasicRule {

    public Rule01To02() {
        super("Rule01To02", "Descriptioanal", 0);
    }

    @Override
    public boolean evaluate(Facts facts) {
        String uuid = (String) facts.get("uuid");
        String target = (String) facts.get("target");
        boolean hasStatus = true;
        return hasStatus && target.equals("02");
    }

    @Override
    public void execute(Facts facts) throws Exception {
        String uuid = (String) facts.get("uuid");

    }
}
