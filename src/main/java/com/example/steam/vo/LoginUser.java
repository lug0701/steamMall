package com.example.steam.vo;

import com.example.steam.entity.Image;
import com.example.steam.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-04-27
 * @time: 14:08
 */
@Component
public class LoginUser {

    private Long id;

    private String nickName;

    private String email;

    private String avatar;

    private int isAdmin;

    private String country;

    private String province;

    private String introduction;

    private int commentNum;

    private int buyGames;

    public LoginUser(){}

    public LoginUser(User user, Image image){
        this.id=user.getId();
        this.email=user.getEmail();
        this.nickName=user.getNickName();
        this.isAdmin=user.getIsAdmin();
        this.avatar=image.getUrl();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString(){
        return "[id="+id+",email="+email+"]";
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public int getBuyGames() {
        return buyGames;
    }

    public void setBuyGames(int buyGames) {
        this.buyGames = buyGames;
    }
}
