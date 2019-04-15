package cn.edu.ustc.sse.workorder.common;

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
}
