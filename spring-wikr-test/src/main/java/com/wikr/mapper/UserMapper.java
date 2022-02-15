package com.wikr.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @Author: xyt
 * @Date: 2022/2/15 12:32
 * @version: 1.0.0
 */

public interface UserMapper {

	@Select("select 'user'")
	void selectById();
}
