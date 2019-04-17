package cn.edu.ustc.sse.workorder.common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class OrderNumberFactory {
    public static String getRandomOrderNumber() {
        Random random = new Random();
        String randChar="";
        randChar += (char)(random.nextInt(25)+65);
        randChar += (char)(random.nextInt(25)+65);
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        return randChar + hashCodeV + (char)(random.nextInt(25)+65);
    }

//    public static void main(String[] args) {
//        //存储图片的物理地址
//        String filePath = "F:\\IDEAProjects\\workorder\\src\\main\\resources\\static\\uploadfiles\\";
//        //子文件夹
//        String sonPath = new SimpleDateFormat("yyyyMMdd").format(new Date());
//        //存储的完整目录
//        String fullPath = filePath + sonPath + "\\";
//        //新的文件名称
//        String newFileName = UUID.randomUUID() + ".jpg";
//        System.out.println(fullPath);
//        File file = new File(fullPath + newFileName);
//        System.out.println(file.getParentFile());
//        System.out.println(file.getAbsolutePath());
//        if(!file.getParentFile().exists()){  //如果文件夹不存在 创建文件夹
//            file.getParentFile().mkdir();
//        }
//    }
}
