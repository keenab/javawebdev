package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.userdetails.User;

@Mapper
public interface UserMapper {
        @Select("SELECT * FROM USERS WHERE username = #{username}")
        public User getUser(String username);

        @Insert("INSERT INTO USERS (username, salt, password, firstname, lastname) VALUES(#{username}, #{salt}, #{password}, #{firstName}, #{lastName})")
        @Options(useGeneratedKeys = true, keyProperty = "userId")
        int insert(User user);
    }

