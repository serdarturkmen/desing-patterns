package com.example.demo.rule;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.core.BasicRule;
import org.springframework.stereotype.Component;

@Component
public class Rule03To04 extends BasicRule {

    public Rule03To04() {
        super("Rule03To04", "Descriptioanal", 0);
    }

    @Override
    public boolean evaluate(Facts facts) {
        String uuid = (String) facts.get("uuid");
        String target = (String) facts.get("target");
        //boolean hasStatus =
        boolean hasStatus = true;
        return hasStatus && target.equals("04");
    }

    @Override
    public void execute(Facts facts) throws Exception {
        String uuid = (String) facts.get("uuid");
        //statusService.changeStatus(uuid, "04");
    }
}
