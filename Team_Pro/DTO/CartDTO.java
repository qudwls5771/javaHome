package DTO;

import java.util.Date;

public class CartDTO {
    private String id; // Member의 아이디 : 참조
    private Integer code; //Shopping의 코드 : 참조
    private String name; // 가게, 호텔 이름
    private Integer Price; // 가격
    private Date day; //날짜 = 이거는 예약한 날짜?
    private String picture; //가게나 호텔, 모텔 사진

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
