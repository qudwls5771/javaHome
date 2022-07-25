package DTO;

import java.lang.reflect.Member;
import java.util.Date;

public class MemberDTO {
    private String id; //아이디
    private String pwd; // 비번
    private String name; // 이름
    private String Year; //생년월일은 일단 String
    private String Phone_N; //폰번
    private String address; //주소
    private String dog_T;  //강아지 종류
    private String dog_S; //강아지 성별
    private String dog_D; //강아지 생년월일

    public MemberDTO(){}

    public MemberDTO(String id1, String pwd2){
        this.id = id;
        this.pwd = pwd;
    }

    public MemberDTO(String id2, String pwd2, String name1, String Year1,
                     String phone_N1, String address1, String dog_T1, String dog_S1, String dog_D1){
        this.id = id2;
        this.pwd = pwd2;
        this.name = name1;
        this.Year = Year1;
        this.Phone_N = phone_N1;
        this.address = address1;
        this.dog_T = dog_T1;
        this.dog_S = dog_S1;
        this.dog_D = dog_D1;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getPhone_N() {
        return Phone_N;
    }

    public void setPhone_N(String phone_N) {
        Phone_N = phone_N;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDog_T() {
        return dog_T;
    }

    public void setDog_T(String dog_T) {
        this.dog_T = dog_T;
    }

    public String getDog_S() {
        return dog_S;
    }

    public void setDog_S(String dog_S) {
        this.dog_S = dog_S;
    }

    public String getDog_D() {
        return dog_D;
    }

    public void setDog_D(String dog_D) {
        this.dog_D = dog_D;
    }

}
