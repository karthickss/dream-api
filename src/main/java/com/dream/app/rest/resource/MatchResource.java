package com.dream.app.rest.resource;

import com.dream.app.core.domain.Image;

import javax.annotation.Resource;
import java.sql.Date;

/**
 *
 * Created By Karthick 08/04/2018
 */

@Resource
public class MatchResource extends BaseResource {

    private Long matId;
    private Long matMatchNo;
    private String matTeamOne;
    private String matTeamTwo;
    private String matDescription = "";
    private String matLongDescription = "";
    private Long matTeamImage;
    private Image matImageOne;
    private Image matImageTwo;
    private Date matStartDate ;

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

    public String getMatTeamOne() {
        return matTeamOne;
    }

    public void setMatTeamOne(String matTeamOne) {
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

    private Date matEndDate ;

    @Override
    public String toString() {
        return "MatchResource{" +
                "matId=" + matId +
                ", matMatchNo=" + matMatchNo +
                ", matTeamOne='" + matTeamOne + '\'' +
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
