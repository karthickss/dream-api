package com.dream.app.core;

import com.inspirenetz.api.core.dictionary.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by karthickraj 08/04/2018.
 */
@Entity
@Table(name="MATCH")
public class Match implements Serializable {

    @Column(name = "MAT_ID",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matId;

    @Column(name = "MAT_TEAM_NAME_ONE",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matMatchNo;

    @Column(name = "MAT_TEAM_NAME_ONE",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private Long matTeamOne;

    @Column(name = "MAT_TEAM_NAME_TWO",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String matTeamTwo;

    @Column(name = "MAT_DESCRIPTION",nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String matDescription = "";

    @Column(name = "MAT_LONG_DESCRIPTION",nullable = true)
    @Basic(fetch = FetchType.EAGER)
    private String matLongDescription = "";

    @Column(name = "MAT_CATEGORY",nullable = true)
    @Basic(fetch = FetchType.EAGER)
    private Integer catCategory = 0;

    @Column(name = "MAT_TEAM_IMAGE",nullable = true)
    @Basic(fetch = FetchType.EAGER)
    private Long catProductImage;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MAT_TEAM_IMAGE_ONE",insertable = false,updatable = false)
    private Image imageOne;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MAT_TEAM_IMAGE_TWO",insertable = false,updatable = false)
    private Image imageTwo;

    @Column(name = "MAT_START_DATE",nullable = true)
    @Basic(fetch = FetchType.EAGER)
    private Date catStartDate ;

    @Column(name = "MAT_END_DATE",nullable = true)
    @Basic(fetch = FetchType.EAGER)
    private Date catEndDate ;

    public Long getMatId() {
        return matId;
    }

    public void setMatId(Long matId) {
        this.matId = matId;
    }

    public Long getMatMatchNo() {
        return matMatchNo;
    }

    public void setMatMatchNo(Long matMatchNo) {
        this.matMatchNo = matMatchNo;
    }

    public Long getMatTeamOne() {
        return matTeamOne;
    }

    public void setMatTeamOne(Long matTeamOne) {
        this.matTeamOne = matTeamOne;
    }

    public String getMatTeamTwo() {
        return matTeamTwo;
    }

    public void setMatTeamTwo(String matTeamTwo) {
        this.matTeamTwo = matTeamTwo;
    }

    public String getMatDescription() {
        return matDescription;
    }

    public void setMatDescription(String matDescription) {
        this.matDescription = matDescription;
    }

    public String getMatLongDescription() {
        return matLongDescription;
    }

    public void setMatLongDescription(String matLongDescription) {
        this.matLongDescription = matLongDescription;
    }

    public Integer getCatCategory() {
        return catCategory;
    }

    public void setCatCategory(Integer catCategory) {
        this.catCategory = catCategory;
    }

    public Long getCatProductImage() {
        return catProductImage;
    }

    public void setCatProductImage(Long catProductImage) {
        this.catProductImage = catProductImage;
    }

    public Image getImageOne() {
        return imageOne;
    }

    public void setImageOne(Image imageOne) {
        this.imageOne = imageOne;
    }

    public Image getImageTwo() {
        return imageTwo;
    }

    public void setImageTwo(Image imageTwo) {
        this.imageTwo = imageTwo;
    }

    public Date getCatStartDate() {
        return catStartDate;
    }

    public void setCatStartDate(Date catStartDate) {
        this.catStartDate = catStartDate;
    }

    public Date getCatEndDate() {
        return catEndDate;
    }

    public void setCatEndDate(Date catEndDate) {
        this.catEndDate = catEndDate;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matId=" + matId +
                ", matMatchNo=" + matMatchNo +
                ", matTeamOne=" + matTeamOne +
                ", matTeamTwo='" + matTeamTwo + '\'' +
                ", matDescription='" + matDescription + '\'' +
                ", matLongDescription='" + matLongDescription + '\'' +
                ", catCategory=" + catCategory +
                ", catProductImage=" + catProductImage +
                ", imageOne=" + imageOne +
                ", imageTwo=" + imageTwo +
                ", catStartDate=" + catStartDate +
                ", catEndDate=" + catEndDate +
                '}';
    }
}
