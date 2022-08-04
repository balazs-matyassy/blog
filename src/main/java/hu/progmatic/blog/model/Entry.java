package hu.progmatic.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Entry {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    private LocalDateTime created;

    public Entry() {
    }

    public Entry(String title, String content, LocalDateTime created) {
        this.title = title;
        this.content = content;
        this.created = created;
    }

    public Entry(Long id, String title, String content, LocalDateTime created) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.created = created;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
