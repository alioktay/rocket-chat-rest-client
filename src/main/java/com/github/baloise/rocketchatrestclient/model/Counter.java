package com.github.baloise.rocketchatrestclient.model;

import java.util.Date;

public class Counter {
    
    boolean joined;
    int members;
    int unreads;
    Date undreadsFrom;
    int msgs;
    Date latest;
    int userMentions;
    boolean success;

    public Counter() {
    }

    public boolean isJoined() {
        return joined;
    }

    public void setJoined(boolean joined) {
        this.joined = joined;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getUnreads() {
        return unreads;
    }

    public void setUnreads(int unreads) {
        this.unreads = unreads;
    }

    public Date getUndreadsFrom() {
        return undreadsFrom;
    }

    public void setUndreadsFrom(Date undreadsFrom) {
        this.undreadsFrom = undreadsFrom;
    }

    public int getMsgs() {
        return msgs;
    }

    public void setMsgs(int msgs) {
        this.msgs = msgs;
    }

    public Date getLatest() {
        return latest;
    }

    public void setLatest(Date latest) {
        this.latest = latest;
    }

    public int getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(int userMentions) {
        this.userMentions = userMentions;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
