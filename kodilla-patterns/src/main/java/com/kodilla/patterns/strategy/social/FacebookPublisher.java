package com.kodilla.patterns.strategy.social.publisher;

public final class FacebookPublisher implements SocialPublisher {
    @Override
    public void share() {
        System.out.println("Sharing post on Facebook");
    }
}