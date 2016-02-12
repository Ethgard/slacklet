package org.riversun.xternal.simpleslackapi.impl;

import org.riversun.xternal.simpleslackapi.SlackChannel;
import org.riversun.xternal.simpleslackapi.SlackUser;
import org.riversun.xternal.simpleslackapi.events.ReactionAdded;
import org.riversun.xternal.simpleslackapi.events.SlackEventType;

public class ReactionAddedImpl implements ReactionAdded {

    private final String emojiName;
    private final String messageID;
    private final SlackChannel channel;
    private final SlackUser user;
    private final SlackUser itemUser;
    private final String fileID;
    private final String fileCommentID;
    private final String timestamp;

    public ReactionAddedImpl(String emojiName, SlackUser user, SlackUser itemUser, SlackChannel channel, String messageID, String fileID, String fileCommentID, String timestamp) {
        this.emojiName = emojiName;
        this.user = user;
        this.itemUser = itemUser;
        this.channel = channel;
        this.messageID = messageID;
        this.fileID = fileID;
        this.fileCommentID = fileCommentID;
        this.timestamp = timestamp;
    }

    @Override
    public String getEmojiName() {
        return emojiName;
    }

    @Override
    public SlackChannel getChannel() {
        return channel;
    }

    @Override
    public String getMessageID() {
        return messageID;
    }

    @Override
    public String getFileID() {
        return fileID;
    }

    @Override
    public String getFileCommentID() {
        return fileCommentID;
    }

    @Override
    public SlackUser getUser() {
        return user;
    }

    @Override
    public SlackUser getItemUser() {
        return itemUser;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.REACTION_ADDED;
    }

	@Override
	public String getTimestamp() {
		return timestamp;
	}

}
