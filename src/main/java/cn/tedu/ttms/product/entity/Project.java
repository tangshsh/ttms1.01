package cn.tedu.ttms.product.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 创建项目实体对象:Project
 * 1)封装数据
 * 2)数据传递
 *FAQ?
 *1)此对象为什么要实现序列化接口?(便于序列化)
 *2)这个对象可能在什么场景需要序列化?
 *2.1)对象可能要缓存到磁盘
 *2.2)对象可能通过网络传输
 *3)在类中添加序列化id的作用是什么?
 *  当对象的成员发生变化时(例如多了一个属性,少了一个属性)可以使我们的
 *  反序列化过程执行
 * 4)默认序列化的过程是安全的吗?(不安全)
 * 如何保证安全?(作业)
 */
public class Project implements Serializable{

	/**
	 * 序列化版本id
	 */
	private static final long serialVersionUID = -8617376423425257328L;
    /**
     * 项目id
     */
	private Integer id;
	/**项目编号(例如 tt-20171011-CN-BJ-001)*/
	private String code;
	/**项目名称(例如:环球游)*/
	private String name;
	/**项目开始时间*/
	private Date beginDate;
	/**项目结束时间*/
	private Date endDate;
	/**项目状态*/
	private Integer valid;
	/**项目备注*/
	private String note;
	/**创建用户*/
	private String createdUser;
	/**创建时间*/
	private Date createdTime;
	/**修改时间*/
	private Date modfiedTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getModfiedTime() {
		return modfiedTime;
	}
	public void setModfiedTime(Date modfiedTime) {
		this.modfiedTime = modfiedTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", code=" + code + ", name=" + name + ", beginDate=" + beginDate + ", endDate="
				+ endDate + ", valid=" + valid + ", note=" + note + ", createdUser=" + createdUser + ", createdTime="
				+ createdTime + ", modfiedTime=" + modfiedTime + "]";
	}
	
	
	





}