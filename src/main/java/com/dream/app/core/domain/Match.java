package com.dream.app.core.domain;
import javax.persistence.*;
import java.sql.Date;

/**
 * Created by karthickraj 08/04/2018.
 */
@Entity
@Table(name="MATCH")
public class Match {

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

    @Column(name = "MAT_TEAM_IMAGE",nullable = true)
    @Basic(fetch = FetchType.EAGER)
    private Long matTeamImage;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MAT_TEAM_IMAGE_ONE",insertable = false,updatable = false)
    private Image matImageOne;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MAT_TEAM_IMAGE_TWO",insertable = false,updatable = false)
    private Image matImageTwo;

    @Column(name = "MAT_START_DATE",nullable = true)
    @Basic(fetch = FetchType.EAGER)
    private Date matStartDate ;

    @Column(name = "MAT_END_DATE",nullable = true)
    @Basic(fetch = FetchType.EAGER)
    private Date matEndDate ;

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

    public Long getMatTeamImage() {
        return matTeamImage;
    }

    public void setMatTeamImage(Long matTeamImage) {
        this.matTeamImage = matTeamImage;
    }

    public Image getMatImageOne() {
        return matImageOne;
    }

    public void setMatImageOne(Image matImageOne) {
        this.matImageOne = matImageOne;
    }

    public Image getMatImageTwo() {
        return matImageTwo;
    }

    public void setMatImageTwo(Image matImageTwo) {
        this.matImageTwo = matImageTwo;
    }

    public Date getMatStartDate() {
        return matStartDate;
    }

    public void setMatStartDate(Date matStartDate) {
        this.matStartDate = matStartDate;
    }

    public Date getMatEndDate() {
        return matEndDate;
    }

    public void setMatEndDate(Date matEndDate) {
        this.matEndDate = matEndDate;
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
                ", matTeamImage=" + matTeamImage +
                ", matImageOne=" + matImageOne +
                ", matImageTwo=" + matImageTwo +
                ", matStartDate=" + matStartDate +
                ", matEndDate=" + matEndDate +
                '}';
    }
}
