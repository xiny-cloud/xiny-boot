package com.xinycloud.modules.demo2.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Xiny
 * @since 2020-02-13
 */
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String address;


	public String getId() {
		return id;
	}

	public SysUser setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public SysUser setName(String name) {
		this.name = name;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public SysUser setAddress(String address) {
		this.address = address;
		return this;
	}

	public static final String ID = "id";

	public static final String NAME = "name";

	public static final String ADDRESS = "address";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysUser{" +
			", id=" + id +
			", name=" + name +
			", address=" + address +
			"}";
	}
}
