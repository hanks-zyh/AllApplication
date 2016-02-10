package xyz.hanks.blog.data;

/**
 * 文章
 * Created by hanks on 16/2/9.
 */
public class Article {
    public String title;
    public String des;
    public String content;
    public String avatarUrl;
    public String imageUrl;
    public long date;
    public long id;

    public Article(long id, String title, String des, String content, String avatarUrl,String imageUrl, long date) {
        this.id = id;
        this.title = title;
        this.des = des;
        this.content = content;
        this.avatarUrl = avatarUrl;
        this.imageUrl = imageUrl;
        this.date = date;
    }
}
