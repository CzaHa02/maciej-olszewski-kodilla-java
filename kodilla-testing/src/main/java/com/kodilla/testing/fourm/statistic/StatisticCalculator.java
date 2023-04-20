package com.kodilla.testing.fourm.statistic;

public class StatisticCalculator {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateStatistics(Statistic statistics) {
        usersCount= statistics.userNames().size();
        postsCount= statistics.postCount();
        commentsCount=statistics.commentsCount();

        averagePostsPerUser= (double) postsCount /usersCount;
        averageCommentsPerUser=(double) commentsCount/usersCount;
        averageCommentsPerPost=(double) commentsCount/postsCount;


    }


public boolean showStatistic(){
        System.out.println("user count"+ usersCount );
    System.out.println("posts count"+ postsCount );
    System.out.println("comments count"+ commentsCount );
    System.out.println("average posts per user"+ averageCommentsPerUser );
    System.out.println("average comments per post"+ averageCommentsPerPost );

    return false;
}

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
