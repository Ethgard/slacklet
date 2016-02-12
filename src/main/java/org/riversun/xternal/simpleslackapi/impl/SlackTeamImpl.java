package org.riversun.xternal.simpleslackapi.impl;

import org.riversun.xternal.simpleslackapi.SlackTeam;

public class SlackTeamImpl implements SlackTeam {
    private final String id;
    private final String name;
    private final String domain;

    public SlackTeamImpl(String id, String name, String domain) {
        this.id = id;
        this.name = name;
        this.domain = domain;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDomain() {
        return domain;
    }
}
