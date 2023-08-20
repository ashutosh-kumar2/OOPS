public class Tester {
    public static void main(String[] args) {
        File f = new File("myFile.txt", 100); // object created at this point in heap memory
        f = new File("yourFile.exe", 20);
        System.out.println(f.getCount());

    }
}
