package com.course.courseplatform.model;

import jakarta.persistence.*;

@Entity
@Table(name="course_content")
public class CourseContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long courseId;

    private String title;

    private String videoUrl;

    private String pdfUrl;

    public CourseContent(){}

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getCourseId(){
        return courseId;
    }

    public void setCourseId(Long courseId){
        this.courseId = courseId;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getVideoUrl(){
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl){
        this.videoUrl = videoUrl;
    }

    public String getPdfUrl(){
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl){
        this.pdfUrl = pdfUrl;
    }
}