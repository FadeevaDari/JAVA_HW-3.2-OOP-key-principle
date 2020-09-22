package ru.netology.domain;

public class PostVk {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String copyright;
    private int viewsCount;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private String postponedId;


    private CommentsInfo commentsInfo;
    private GeoInfo geoInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;
    private PostSource postSource;

    // + get/set на все поля

}
