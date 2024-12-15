package com.crud.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Badges {
    @JsonProperty("votes")
    private int votes;

    @JsonProperty("attachmentsByType")
    private AttachmentsByType attachmentsByType;

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public AttachmentsByType getAttachmentsByType() {
        return attachmentsByType;
    }

    public void setAttachmentsByType(AttachmentsByType attachmentsByType) {
        this.attachmentsByType = attachmentsByType;
    }
}
