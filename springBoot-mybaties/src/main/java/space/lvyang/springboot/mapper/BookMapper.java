package space.lvyang.springboot.mapper;






import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import space.lvyang.springboot.model.Book;

import java.util.List;


@Mapper
@Repository
public interface BookMapper { /**
     * Check the user
     */
int deleteByPrimaryKey(Long bookid);

        int insert(Book record);

        Book selectByPrimaryKey(Long bookid);

        List<Book> selectAll();

        int updateByPrimaryKey(Book record);
}
