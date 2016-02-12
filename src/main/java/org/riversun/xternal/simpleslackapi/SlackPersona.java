package org.riversun.xternal.simpleslackapi;

public interface SlackPersona {
    enum SlackPresence { UNKNOWN, ACTIVE, AWAY, AUTO }

    String getId();

    String getUserName();
    String getRealName();
    String getUserMail();
    String getUserSkype();
    String getUserPhone();
    String getUserTitle();
    boolean isDeleted();
    boolean isAdmin();
    boolean isOwner();
    boolean isPrimaryOwner();
    boolean isRestricted();
    boolean isUltraRestricted();
    boolean isBot();
    String getTimeZone();
    String getTimeZoneLabel();
    Integer getTimeZoneOffset();
    SlackPresence getPresence();
}
