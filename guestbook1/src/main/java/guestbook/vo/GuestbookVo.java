package guestbook.vo;

import lombok.*;

@Getter
@Setter
@ToString
public class GuestbookVo {
    private Long no;
    private String name;
    private String password;
    private String contents;
    private String regDate;
}
