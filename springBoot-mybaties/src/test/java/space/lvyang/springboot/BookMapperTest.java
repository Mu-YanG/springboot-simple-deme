package space.lvyang.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import space.lvyang.springboot.mapper.BookMapper;
import space.lvyang.springboot.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookMapperTest {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    UserMapper userMapper;

    @Test
    public void getBook(){
      //  List<Book> book = bookMapper.getBook();
        System.out.println(userMapper.selectAll());
    }
}
