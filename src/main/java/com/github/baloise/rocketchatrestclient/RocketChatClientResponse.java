package com.github.baloise.rocketchatrestclient;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.baloise.rocketchatrestclient.model.*;

//This is an internal class that really shouldn't be used,
//it's just meant to handle the response from the server
public class RocketChatClientResponse {
    private boolean success;
//    private int count, offset, total;
    private String error;
    private ServerInfo info;
    private Message[] messages;
    private Message message;
    private User[] users;
    private User user;
    private Channel[] channels;
    private Channel channel;
    private Room[] ims;
    private Group[] groups;
    private Group group;
    private Integration[] integrations;
    private Integration integration;
    private AuthData data;
    private Counter counter;

    public void setSuccess(boolean result) {
        this.success = result;
    }

    public boolean isSuccessful() {
        return this.success;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return this.error;
    }

    public boolean hasAnError() {
        return !this.error.isEmpty();
    }

    @JsonSetter("info")
    public void setServerInfo(ServerInfo info) {
        this.info = info;
    }

    @JsonGetter("info")
    public ServerInfo getServerInfo() {
        return this.info;
    }

    public boolean hasServerInfo() {
        return this.info != null;
    }

    public void setMessages(Message[] messages) {
        this.messages = messages;
    }

    public Message[] getMessages() {
        return this.messages;
    }

    public boolean hasMessages() {
        return this.messages != null;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return this.message;
    }

    public boolean hasMessage() {
        return this.message != null;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return this.users;
    }

    public boolean hasUsers() {
        return this.users != null;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    
    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public Counter getCounter() {
        return this.counter;
    }

    
    public boolean hasUser() {
        return this.user != null;
    }

    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }

    public Channel[] getChannels() {
        return this.channels;
    }

    public boolean hasChannels() {
        return this.channels != null;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public boolean hasChannel() {
        return this.channel != null;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Group[] getGroups() {
        return this.groups;
    }

    public boolean hasGroups() {
        return this.groups != null;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return this.group;
    }

    public boolean hasGroup() {
        return this.group != null;
    }

    @JsonSetter("ims")
    public void setDirectMessages(Room[] dms) {
        this.ims = dms;
    }

    @JsonGetter("ims")
    public Room[] getDirectMessages() {
        return this.ims;
    }

    public boolean hasDirectMessages() {
        return this.ims != null;
    }
    
    public void setIntegrations(Integration[] integrations) {
        this.integrations = integrations;
    }
    
    public Integration[] getIntegrations() {
        return this.integrations;
    }
    
    public boolean hasIntegrations() {
        return this.integrations != null;
    }
    
    public void setIntegration(Integration integration) {
        this.integration = integration;
    }
    
    public Integration getIntegration() {
        return this.integration;
    }
    
    public boolean hasIntegration() {
        return this.integration != null;
    }

    public AuthData getData() {
        return data;
    }

    public void setData(AuthData data) {
        this.data = data;
    }

    public boolean hasAuthData(){
        return this.data !=null;
    }
}
