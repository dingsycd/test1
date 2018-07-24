package file;

import java.io.File;
import java.text.SimpleDateFormat;

public class TotalFileSizeSequential {
    public static String fileName = "E:\\员工.xls";
    // 递归方式 计算文件的大小
    private long getTotalSizeOfFilesInDir(final File file) { 
        if (file.isFile())
            return file.length();
        final File[] children = file.listFiles();
        long total = 0;
        if (children != null)
            for (final File child : children)
                total += getTotalSizeOfFilesInDir(child);
        return total;
    }
    public static void main(final String[] args) {
        final long start = System.nanoTime();
        final long t = System.currentTimeMillis();
        SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
        String time = now.format(t);
        final long total = new TotalFileSizeSequential()
                .getTotalSizeOfFilesInDir(new File(fileName));
        final long end = System.nanoTime();
        System.out.println("Total Size: " + total);
        System.out.println(time);
        System.out.println("Time taken: " + (end - start) / 1.0e9);
    }
}
