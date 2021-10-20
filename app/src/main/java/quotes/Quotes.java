package quotes;


import java.util.ArrayList;

public class Quotes {

    private ArrayList<String> tags ;
    private String auther;
    private String likes;
    private String text;


    public Quotes(ArrayList<String> tags, String auther, String likes, String text) {
        this.tags = tags;
        this.auther = auther;
        this.likes = likes;
        this.text = text;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "tags=" + tags +
                ", auther='" + auther + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }


}
