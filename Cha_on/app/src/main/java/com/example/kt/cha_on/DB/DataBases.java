package com.example.kt.cha_on.DB;

import android.provider.BaseColumns;

/**
 * Created by kt on 2015-11-22.
 */
public class DataBases {



    // 프로그램 프레임 테이블
    public static final class CreateProgramDB implements BaseColumns {
        public static final String CHANNELNAME = "channelName";      // 채널명
        public static final String PROGRAMID = "programId";			// 프로그램ID
        public static final String PROGRAMNAME = "programName";		// 프로그램명
        public static final String CATEGORIE = "categorie";			// 카테고리
        public static final String KEYWORDLIST = "keywordList";			// 방송키워드
        public static final String BROADCASTTIME = "broadcastTime";		// 방송시간
        public static final String LIKECNT = "likeCnt";					// 좋아요수
        public static final String PROGRAMPRODUCT = "programProduct";   // 상품정보리스트
        public static final String ONAIR = "onAir";                     // 방송중인지여부
        public static final String VIEWERCNT = "viewerCnt";             // 시청자수
        public static final String REALVIEWRATE = "realViewRate";       // 실제시청률
        public static final String SERVERVIEWRATE = "serverViewRate";   // 서버시청률
        public static final String _TABLENAME = "writeProgram";
        public static final String _CREATE_PROGRAM = "create table "+_TABLENAME+"("
                +_ID+" integer primary key autoincrement, "
                +CHANNELNAME+"text not null ,"
                +PROGRAMID+" integer not null , "
                +PROGRAMNAME+" text not null , "
                +CATEGORIE+" text not null , "
                +KEYWORDLIST+" text not null , "
                +BROADCASTTIME+" text not null , "
                +LIKECNT+" integer not null);"
                +PROGRAMPRODUCT+"text not null ,"
                +ONAIR+"text not null ,"
                +VIEWERCNT+"integer not null ,"
                +REALVIEWRATE+"integer not null ,"
                +SERVERVIEWRATE+"integer not null";
    }

    // 유저 테이블
    public static final class CreateUserDB implements BaseColumns{
        public static final String USERID = "userId";					// 유저Id
        public static final String USERNAME = "userName";			// 유저Name
        public static final String PREFERENCECHANNEL = "preferenceChannel";		// 선호채널
        public static final String IPTV = "ipTv";					// 유저가 사용하는 IPTV종류
        public static final String _TABLENAME = "user";
        public static final String _CREATE_USER = "create table "+_TABLENAME+"("
                +USERID+" integer not null , "
                +USERNAME+" text not null , "
                +PREFERENCECHANNEL+" text not null , "
                +IPTV+" text not null";
    }


}