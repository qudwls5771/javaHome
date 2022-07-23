public class ShopDTO {
    private Integer code; // 가게코드
    private String name; //가게이름
    private String address; // 가게주소
    private Integer price; //가격
    private String picture; // 가게사진

    public ShopDTO(){
        super();
    }

    public ShopDTO(Integer code, String name, String address, Integer price, String picture){
        super();
        this.code = code;
        this.name = name;
        this.address = address;
        this.price = price;
        this.picture = picture;
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
