package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * DateTime: 2016/9/18 21:54
 * 功能：压缩文件为zip
 * 思路：
 */
public class FileZip {

    //测试
    public static void main(String[] args) {
        try {
            zip("G:\\demo","G:\\demo.zip");
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param inputFileName 要压缩的文件夹(整个完整路径)
     * @param zipFileName   压缩后的文件(整个完整路径)
     */
    public static void zip(String inputFileName,String zipFileName) throws Exception {
        zip(zipFileName,new File(inputFileName));
    }
    public static void zip(String zipFileName,File inputFile) throws Exception {
        ZipOutputStream out=new ZipOutputStream(new FileOutputStream(zipFileName));
        zip(out,inputFile,"");
        out.flush();
        out.close();
    }

    private static void zip(ZipOutputStream out,File f,String base) throws Exception{
        if(f.isDirectory()){
            File[] f1=f.listFiles();
            out.putNextEntry(new ZipEntry(base+"/"));
            base=base.length()==0?"":base+"/";
            for ( int i = 0; i < f1.length; i++ ) {
                zip(out,f1[i],base+f1[i].getName());
            }
        }else {
            out.putNextEntry(new ZipEntry(base));
            FileInputStream in=new FileInputStream(f);
            int b;
            while ( -1!=(b=in.read()) ){
                out.write(b);
            }
            in.close();
        }
    }



}
