package com.anujeetchatterjee.getVaxxed.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CITIZEN_TABLE")
public class Citizen {
    @GeneratedValue
    @NotNull
    private int id;

    @Id
    @NotNull
    private Long aadhaar;

    private String name;
    private Integer age;
    private Character gender;
    private Long phone;
    private String email;
    private String profession;
    //    private String addressLine1;
//    private String addressLine2;
    private String district;
    private String state;
    private String city;
    private Integer pincode;
    // pincode
//    private String latitude;
//    private String longitude;
//    private String nationality;
    private Boolean prevContracted;
    // if True
    private Date datePositive;
    private Date dateNegative;
    private String hospitalName;

    private Boolean currentlySuffering;
    private String disability;

    public Citizen(Long aadhaarNumber, String name, Integer age, Character gender, Long phone, String email, String profession, String district, String state, String city, Integer pincode, Boolean prevContracted, Date datePositive, Date dateNegative, String hospitalName, Boolean currentlySuffering, String disability) {
        this.aadhaar = aadhaarNumber;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.profession = profession;
        this.district = district;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.prevContracted = prevContracted;
        this.datePositive = datePositive;
        this.dateNegative = dateNegative;
        this.hospitalName = hospitalName;
        this.currentlySuffering = currentlySuffering;
        this.disability = disability;
    }

    public int getId() {
        return id;
    }

    public Long getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(Long aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public Boolean getPrevContracted() {
        return prevContracted;
    }

    public void setPrevContracted(Boolean prevContracted) {
        this.prevContracted = prevContracted;
    }

    public Date getDatePositive() {
        return datePositive;
    }

    public void setDatePositive(Date datePositive) {
        this.datePositive = datePositive;
    }

    public Date getDateNegative() {
        return dateNegative;
    }

    public void setDateNegative(Date dateNegative) {
        this.dateNegative = dateNegative;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Boolean getCurrentlySuffering() {
        return currentlySuffering;
    }

    public void setCurrentlySuffering(Boolean currentlySuffering) {
        this.currentlySuffering = currentlySuffering;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }
}
