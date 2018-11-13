package com.example.demo.rule;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.core.BasicRule;
import org.springframework.stereotype.Component;

@Component
public class Rule02To05 extends BasicRule {

    public Rule02To05() {
        super("Rule02To05", "Descriptioanal", 0);
    }

    @Override
    public boolean evaluate(Facts facts) {
        String uuid = (String) facts.get("uuid");
        String target = (String) facts.get("target");
        //boolean hasStatus = statusService.hasStatus(uuid, "02");
        boolean hasStatus = true;
        return hasStatus && target.equals("03Or05S");
    }

    @Override
    public void execute(Facts facts) throws Exception {
        String uuid = (String) facts.get("uuid");
        //statusService.changeStatus(uuid, "05S");

    }

}
