package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {

        User millenials = new Millenials("John");
        User yGeneration = new YGeneration("Kate");
        User zGeneration = new ZGeneration("Tom");


        millenials.setSocialPublisher(new FacebookPublisher());
        yGeneration.setSocialPublisher(new TwitterPublisher());
        zGeneration.setSocialPublisher(new SnapchatPublisher());

        millenials.sharePost();
        yGeneration.sharePost();
        zGeneration.sharePost();
    }

    @Test
    void testIndividualSharingStrategy() {

        User user = new Millenials("Alice");


        user.setSocialPublisher(new TwitterPublisher());


        user.sharePost();
    }
}