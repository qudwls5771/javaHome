public class study {
    private int code; // 가게코드
    private String name; //가게이름
    private String address; // 가게주소
    private int price; //가격
    private String picture; // 가게사진

    public study(){
        super();
    }

    public study(int code, String name, String address, int price, int picture){
        super();
        this.code = code;
        this.name = name;
        this.address = address;
        this.price = price;
        this.picture = picture;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    

}
