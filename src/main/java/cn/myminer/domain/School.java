package cn.myminer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:学校。
 * @author LiLiexuan
 * @date 2015年11月15日 22:11:33
 *
 */
public class School implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String schoolId;
	private String schoolName;
	private String province;
	private String city;
	private String area;
	private Date   startDate;
	
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	

}
