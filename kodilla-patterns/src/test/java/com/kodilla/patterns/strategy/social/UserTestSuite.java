package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        // Given
        User millenials = new Millenials("John");
        User yGeneration = new YGeneration("Kate");
        User zGeneration = new ZGeneration("Tom");

        // When & Then
        millenials.setSocialPublisher(new FacebookPublisher());
        yGeneration.setSocialPublisher(new TwitterPublisher());
        zGeneration.setSocialPublisher(new SnapchatPublisher());

        millenials.sharePost(); // Sharing post on Facebook
        yGeneration.sharePost(); // Sharing post on Twitter
        zGeneration.sharePost(); // Sharing post on Snapchat
    }

    @Test
    void testIndividualSharingStrategy() {
        // Given
        User user = new Millenials("Alice");

        // When
        user.setSocialPublisher(new TwitterPublisher());

        // Then
        user.sharePost();
    }
}