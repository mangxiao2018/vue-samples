package com.mangxiao.vue.backend.sample.model;

import java.util.Date;

public class Student {
    private Long id;
    /** 学生姓名*/
    private String stuName;
    /** 学生编号 */
    private String stuNo;
    /** 语文成绩*/
    private Float chineseScore;
    /** 数学成绩 */
    private Float mathScore;
    /** 英语成绩 */
    private Float englishScore;
    /** 头像地址 */
    private String profileAvatarImage;
    /**创建时间*/
    private Date createAt;
    /**更新时间*/
    private Date updateAt;
    /**创建人*/
    private Long createUser;
    /**更新人*/
    private Long updateUser;
    /**是否有效*/
    private int yn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public Float getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(Float chineseScore) {
        this.chineseScore = chineseScore;
    }

    public Float getMathScore() {
        return mathScore;
    }

    public void setMathScore(Float mathScore) {
        this.mathScore = mathScore;
    }

    public Float getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(Float englishScore) {
        this.englishScore = englishScore;
    }

    public String getProfileAvatarImage() {
        return profileAvatarImage;
    }

    public void setProfileAvatarImage(String profileAvatarImage) {
        this.profileAvatarImage = profileAvatarImage;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public int getYn() {
        return yn;
    }

    public void setYn(int yn) {
        this.yn = yn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                ", profileAvatarImage='" + profileAvatarImage + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", createUser=" + createUser +
                ", updateUser=" + updateUser +
                ", yn=" + yn +
                '}';
    }
}
