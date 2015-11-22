package com.example.kt.cha_on.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kt on 2015-11-22.
 */
public class Program {
    private String channelName;         // 채널명
    private String programName;         // 프로그램명
    private String programId;           // 프로그램ID
    private String categorie;           // 카테고리
    private List<String> keywordList = new ArrayList<String>();     //관련 키워드리스트
    private String broadcastTime;       // 방송시간
    private int likeCnt;                // 좋아요수
    private List<String> programProduct; // 상품정보리스트 상품명,상품이미지,링크
    private Boolean onAir;              // 방송중인지 여부
    private String viewerCnt;            // 시청자수
    private String realViewRate;         // 실제시청률(방송사시청률)
    private String serverViewRate;       // 서버시청률
    public Program(){}
    public Program(String channelName, String programName , String categorie ,
                   List<String> keywordList , String broadcastTime, int likeCnt,
                   List<String> programProduct , Boolean onAir, String viewerCnt,
                   String realViewRate, String serverViewRate){
        this.channelName = channelName;
        this.programName = programName;
        this.categorie  = categorie;
        this.keywordList = keywordList;
        this.broadcastTime = broadcastTime;
        this.likeCnt = likeCnt;
        this.programProduct = programProduct;
        this.onAir = onAir;
        this.viewerCnt = viewerCnt;
        this.realViewRate = realViewRate;
        this.serverViewRate = serverViewRate;

    }

    public String getChannelName(){
        return this.channelName;
    }

    public void setChannelName(String channelName){
        this.channelName=channelName;
    }

    public String getProgramName(){
        return this.programName = programName;
    }

    public void setProgramName(String programName){
        this.programName=programName;
    }

    public String getProgramId(){
        return this.programId;
    }

    public void setProgramId(String programId){
        this.programId=programId;
    }

    public String getCategorie(){
        return this.categorie;
    }

    public void setCategorie(String categorie){
        this.categorie=categorie;
    }

    public List<String> getKeywordList(){
        return this.keywordList;
    }

    public void setKeywordList(List<String> keywordList){
        this.keywordList = keywordList;
    }

    public String getBroadcastTime(){
        return this.broadcastTime;
    }

    public void setBroadcastTime(String broadcastTime){
        this.broadcastTime = broadcastTime;
    }

    public int getLikeCnt(){
        return this.likeCnt;
    }

    public void setLikeCnt(int likeCnt){
        this.likeCnt = likeCnt;
    }

    public List<String> getProgramProduct(){
        return this.programProduct = programProduct;
    }

    public void setProgramProduct(List<String> programProduct){
        this.programProduct = programProduct;
    }

    public Boolean getOnAir() {
        return onAir;
    }

    public void setOnAir(Boolean onAir) {
        this.onAir = onAir;
    }

    public String getViewerCnt() {
        return viewerCnt;
    }

    public void setViewerCnt(String viewerCnt) {
        this.viewerCnt = viewerCnt;
    }

    public String getRealViewRate() {
        return realViewRate;
    }

    public void setRealViewRate(String realViewRate) {
        this.realViewRate = realViewRate;
    }

    public String getServerViewRate() {
        return serverViewRate;
    }

    public void setServerViewRate(String serverViewRate) {
        this.serverViewRate = serverViewRate;
    }


    // 방송정보들을 담고있는 내부객체(클래스)
    private class BroadcastInfo{
        private String pannel;          //  패널
        private String mc;              //  MC
        private String programIntro;    //  프로그램 소개

        public String getPannel() {
            return pannel;
        }

        public void setPannel(String pannel) {
            this.pannel = pannel;
        }

        public String getMc() {
            return mc;
        }

        public void setMc(String mc) {
            this.mc = mc;
        }

        public String getProgramIntro() {
            return programIntro;
        }

        public void setProgramIntro(String programIntro) {
            this.programIntro = programIntro;
        }
    }

//    public static Program fromJson(JSONObject object) throws JSONException {
//        return new Program(
//                object.getString("channelName"),
//                object.getString("programName"),
//                object.getString("programId"));
//
//
//    }


}
