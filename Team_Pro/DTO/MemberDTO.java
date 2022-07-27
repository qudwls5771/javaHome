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
    private String pet_T;  //강아지 종류
    private String pet_S; //강아지 성별
    private String pet_D; //강아지 생년월일

    public MemberDTO(){}

    public MemberDTO(String id1, String pwd2){
        this.id = id;
        this.pwd = pwd;
    }

    public MemberDTO(String id2, String pwd2, String name1, String Year1,
                     String phone_N1, String address1, String pet_T1, String pet_S1, String pet_D1){
        this.id = id2;
        this.pwd = pwd2;
        this.name = name1;
        this.Year = Year1;
        this.Phone_N = phone_N1;
        this.address = address1;
        this.pet_T = pet_T1;
        this.pet_S = pet_S1;
        this.pet_D = pet_D1;
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

    public String getPet_T() {
        return pet_T;
    }

    public void setPet_T(String pet_T) {
        this.pet_T = pet_T;
    }

    public String getPet_S() {
        return pet_S;
    }

    public void setPet_S(String pet_S) {
        this.pet_S = pet_S;
    }

    public String getPet_D() {
        return pet_D;
    }

    public void setPet_D(String pet_D) {
        this.pet_D = pet_D;
    }
}
