public class HotelDTO {
    private  Integer code_H; //호텔 코드번호
    private String name; //이름
    private String address; // 호텔주소
    private Integer price; //가격
    private String picture; // 가게사진
    public Integer getCode_H() {
        return code_H;
    }
    public void setCode_H(Integer code_H) {
        this.code_H = code_H;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    
    
}
