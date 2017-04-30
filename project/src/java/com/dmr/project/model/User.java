/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.project.model;

/**
 *
 * @author chamara
 */

public class User {
    
    private int userId;
    private String firstname;
    private String lastname;
    private String address;
    private String nationalId;
    private String email;
    private int mobileNo;
    private int cebAccountNo;
    private String areaOffice;
    private boolean isMeterIssued;
    private int meterId;
    private String requestDate;
    private String issuedDate;
    private String password;
    private String username;

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getCebAccountNo() {
        return cebAccountNo;
    }

    public void setCebAccountNo(int cebAccountNo) {
        this.cebAccountNo = cebAccountNo;
    }

    public String getAreaOffice() {
        return areaOffice;
    }

    public void setAreaOffice(String areaOffice) {
        this.areaOffice = areaOffice;
    }

    public boolean isIsMeterIssued() {
        return isMeterIssued;
    }

    public void setIsMeterIssued(boolean isMeterIssued) {
        this.isMeterIssued = isMeterIssued;
    }

    public int getMeterId() {
        return meterId;
    }

    public void setMeterId(int meterId) {
        this.meterId = meterId;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassowrd(){
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
}
