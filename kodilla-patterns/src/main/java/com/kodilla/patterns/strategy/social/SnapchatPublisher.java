package com.kodilla.patterns.strategy.social.publisher;

public final class SnapchatPublisher implements SocialPublisher {
    @Override
    public void share() {
        System.out.println("Sharing post on Snapchat");
    }
}