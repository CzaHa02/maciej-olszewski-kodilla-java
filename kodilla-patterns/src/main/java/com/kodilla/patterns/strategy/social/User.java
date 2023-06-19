package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SocialPublisher;

public sealed class User permits Millenials, YGeneration, ZGeneration {
    private final String username;
    private SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public void sharePost() {
        if (socialPublisher != null) {
            socialPublisher.share();
        } else {
            System.out.println(username + " does not have a preferred social media platform set.");
        }
    }
}