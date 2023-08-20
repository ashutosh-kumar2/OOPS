import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        final File f1 = new File("myFile.txt", 100, new FileMetaData(new Date(), new Date(), 1)); // object created at this point in heap memory
        File f2 = new File("myFile.txt", 100, new FileMetaData(new Date(), new Date(), 1));
        f2.cmp(f1);
//        f = new File("yourFile.exe", 20);
//        System.out.println(f.getCount());
//        final int x = 10;
//        x++;
//        f.setName("myOtherFile.txt");
//        f.getName();
//        File f2 = new File ("my2ndFile.txt", 1000, fileMetaData);
//        f2.setSizeInBytes(); // error as sizeInBytes is final
//        f2 = new File ("myOther2ndFile", 100000, fileMetaData); // no error as f2 is not final

        f1.fileMetaData.version = 10; // can change this value as version is not final
    }
}
