package ru.netology.domain;

public class PostVk {
    private int id;
    private int ownerId;
    private int fromId;
    private int date;
    private String text;
    private String copyright;
    private int viewsCount;

    private CommentsInfo commentsInfo;
    private GeoInfo geoInfo;
    private ImageInfo imageInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;

    // + get/set на все поля

}
