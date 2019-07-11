package cn.edu.cuit.mallsystem.dao;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
@Select("select count(*) from users where user_name=#{name} and user_pass=#{pass}")
public int findUserByNameAndPass();
}
