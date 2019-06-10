package space.lvyang.springboot.mapper;


import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;
import space.lvyang.springboot.model.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper{ /**
     * Check the user
     */
int deleteByPrimaryKey(Long id);

        int insert(User record);

        User selectByPrimaryKey(Long id);

        List<User> selectAll();

        int updateByPrimaryKey(User record);
}
