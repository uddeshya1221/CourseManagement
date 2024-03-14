
package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String subject;
    private int chapters;
    private Type type;
    private LearnMode learnMode;

    // Constructor
    public Course() {
    }

    public Course(String name, String subject, int chapters, Type type, LearnMode learnMode) {
        this.name = name;
        this.subject = subject;
        this.chapters = chapters;
        this.type = type;
        this.learnMode = learnMode;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LearnMode getLearnMode() {
        return learnMode;
    }

    public void setLearnMode(LearnMode learnMode) {
        this.learnMode = learnMode;
    }

    // Enums for Type and LearnMode
    public enum Type {
        PERSONALIZED,
        GROUP
    }

    public enum LearnMode {
        ASSISTED,
        SELF_LEARNING
    }
}

