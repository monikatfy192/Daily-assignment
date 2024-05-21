package example.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="instructor_detail")
public class InstructorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "youtube_channel")
    private String youtubeChannel;
    @Column(name = "hobby")
    private String hobby;
    @OneToOne(mappedBy = "instructorDetails")
    private Instructor instructor;

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public InstructorDetails() {
    }

    public InstructorDetails( String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InstructorDetails{" +
                "id=" + id +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InstructorDetails)) return false;
        InstructorDetails that = (InstructorDetails) o;
        return getId() == that.getId() && getYoutubeChannel().equals(that.getYoutubeChannel()) && getHobby().equals(that.getHobby());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getYoutubeChannel(), getHobby());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
