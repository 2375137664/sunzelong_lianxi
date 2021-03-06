package com.sunzelong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.sunzelong.bean.User;

public interface UserMapper {

	
	List<User> list(String name);

	User getById(Integer userId);

	@Update("UPDATE cms_user SET locked=${status} WHERE id=${userId}")
	int updateStatus(@Param("userId") Integer userId, 
			@Param("status") int status);

}
