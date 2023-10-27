package com.b107.interview.domain.resume.entity;

import com.b107.interview.domain.user.entity.User;
import com.b107.interview.util.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Resume extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resumeId;

    @Column(length = 30, nullable = false)
    private String companyName;

    @Column(nullable = true)
    private LocalDateTime interviewDate;

    @Column(nullable = false)
    private boolean hasReview;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ResumeItem> resumeItems;
}