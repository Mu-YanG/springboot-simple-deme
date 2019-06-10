package space.lvyang.springboot.model;

import java.util.Date;

public class Book {
    private Long bookid;

    private Long bookname;

    private Long userid;

    private Date createtime;

    public Long getBookid() {
        return bookid;
    }

    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }

    public Long getBookname() {
        return bookname;
    }

    public void setBookname(Long bookname) {
        this.bookname = bookname;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}