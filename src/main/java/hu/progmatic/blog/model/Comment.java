package hu.progmatic.blog.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    // many comments to one entry (egy bejegyzéshez sok komment tartozhat)
    @ManyToOne()
    // idegen kulcs beállítása (mi legyen az oszlop neve?)
    @JoinColumn(name = "entry_id", nullable = false)
    private Entry entry;

    private String content;

    private LocalDateTime created;

    public Comment() {
    }

    public Comment(Entry entry, String content, LocalDateTime created) {
        this.entry = entry;
        this.content = content;
        this.created = created;
    }

    public Comment(Long id, Entry entry, String content, LocalDateTime created) {
        this.id = id;
        this.entry = entry;
        this.content = content;
        this.created = created;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
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
