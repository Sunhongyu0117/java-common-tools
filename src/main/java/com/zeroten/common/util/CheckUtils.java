package com.zeroten.common.util;

public class CheckUtils {

    public static boolean isAnyEmpty(String[] strings) {
        for(int i = 0 ;i<strings.length;i++){
            if(strings[i].equals("")){
                return false;
            }
        }
        return  true;
    }

    public static boolean isEmpty(Object[] strings) {
        if(strings!=null&&strings.length>0){
            return false;
        }

        return true;
    }

    public static boolean equals(String str1, String str2) {
        if(str1==null ||str2==null){
            return false;
        }else{
            if(str1.length()!=str2.length()){
                return false;
            }else{
                char[] str1Arr = str1.toCharArray();
                char[] str2Arr = str2.toCharArray();
                for(int i=0;i<str1Arr.length;i++){
                    if(str1Arr[i]!=str2Arr[i]){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean equalsInteger(Integer n1, Integer n2) {
        if (n1==null || n2==null){
            return  false;
        }else{
            if(n1.intValue()!=n2.intValue()){
                return false;
            }
        }
        return true;
    }
}
