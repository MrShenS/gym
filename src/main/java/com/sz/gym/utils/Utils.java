package com.sz.gym.utils;

/**
 * @ClassNameUtils
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1918:44
 * @Version 1.0
 */
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;


/**
 * 	工具类
 * @author submitX
 *
 */
public class Utils {

    /**
     * 	获取格式化日期
     * @param date
     * @return
     */
    public static String getFormatterDate(Date date) {
        LocalDateTime instant = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时:mm分:ss秒");
        String format = formatter.format(instant);
        return format;
    }

    public static enum RoleName {
        TEACHER, STUDENT, ADMIN;
        @Override
        public String toString() {
            String name = name();
            if (name.equals("TEACHER")) {
                return "teacher";
            } else if (name.equals("STUDENT")) {
                return "student";
            } else {
                return "admin";
            }
        }

        /**
         * 	获取对应的中文名称
         * @return
         */
        public String getChineseName() {
            String name = name();
            if (name.equals("TEACHER")) {
                return "教师";
            } else if (name.equals("STUDENT")) {
                return "学生";
            } else {
                return "超级管理员";
            }
        }
    };

    /**
     * 	获取一串32位的uuid字符串
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 	根据文件名称获取后缀
     * @param originalFilename
     * @return
     */
    public static String getSubfix(String originalFilename) {
        int lastOf = originalFilename.lastIndexOf(".");
        if (lastOf < 0) {
            return "";
        }
        return originalFilename.substring(lastOf);
    }

    /**
     * 	学生作业状态标识
     * @author submitX
     *  未交, 已交, 已被审阅, 已结束(学生不可修改)
     */
    public static enum HomeworkStatus {
        NOSUBMIT, SUBMIT, ACCEPTANCE, OVER;
    }

    /**
     * 	老师作业状态标识
     * @author submitX
     *  0进行中，1完成(acceptance到时)， 2结束
     */
    public static enum WorkStatus {
        ONLINE, FINISH, OVER;
    }

    /**
     * 	获取文件存放目录
     *  根目录//文件目录，eg: /save/save/xxx.zip
     * @return
     */
    public static String getFilesSaveRootPath() {
        String rootPath = getFilesRoot();
        return rootPath + "save" + File.separator;
    }

    /**
     * 	获取用户上传的文件根目录
     * @return
     */
    public static String getFilesRoot() {
        String name = System.getProperty("os.name");
        if (name.contains("Windows")) {
            return "D:" + File.separator + "data" + File.separator;
        } else {
            return File.separator + "data" + File.separator + "wwwroot" + File.separator + "files" +File.separator;
        }
    }

    /**
     * 	获取临时文件存放目录
     *   根目录//文件目录， eg：/temp/save/xxx.zip
     * @return
     */
    public static String getTempFilesSaveRootPath() {
        String rootPath = getFilesRoot();
        return rootPath + File.separator + "temp" + File.separator;
    }

    /**
     * 	获取头像文件存放的虚拟目录
     * @return
     */
    public static String getAvatarAbsuloteFilesSaveRootPath() {
        return "avatar" + File.separator;
    }

    /**
     * 	获取file下面的文件url
     * @param name
     * @return
     */
    public static String getFileByNameInFiles(String name) {
        return getRootPath() + "files" + File.separator + name;
    }
    /**
     * 获取 root目录
     * @return path
     */
    public static String getRootPath(){
        return getWEB_INF().replace("WEB-INF/", "");
    }
    /**
     * 获取 web-inf目录
     * @return path
     */
    public static String getWEB_INF(){
        return getClassPath().replace("classes/", "");
    }
    /**
     * 获取到classes目录
     * @return path
     */
    public static String getClassPath(){
        String systemName = System.getProperty("os.name");
        //判断当前环境，如果是Windows 要截取路径的第一个 '/'
        if(!StringUtils.isBlank(systemName) && systemName.indexOf("Windows") !=-1){
            return Utils.class.getResource("/").getFile().toString().substring(1);
        }else{
            return Utils.class.getResource("/").getFile().toString();
        }
    }

}
