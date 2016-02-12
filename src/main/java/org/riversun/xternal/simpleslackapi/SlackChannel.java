package org.riversun.xternal.simpleslackapi;

import java.util.Collection;

public interface SlackChannel {

    enum SlackChannelType {
        PUBLIC_CHANNEL, PRIVATE_GROUP, INSTANT_MESSAGING
    }

    String getId();

    String getName();

    Collection<SlackUser> getMembers();

    String getTopic();

    String getPurpose();

    boolean isDirect();

    boolean isMember();

    boolean isArchived();

    SlackChannelType getType();

}
