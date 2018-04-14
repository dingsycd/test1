package algorithm;

import java.io.File;

/**
 * 如何找出某一个目录下的所有文件？
 */
public class FindFile {
    public static void main(String[] s){
        File f=new File("C:\\");
        File[]  f1=f.listFiles();
        for(int i=0;i<f1.length;i++){
            if(f1[i].isDirectory()){
                System.out.println("dirctory  is  "+f1[i].getName());
            }
            else{
                System.out.println("file is "+f1[i].getName());
            }
        }
    }
}
