public class File {
    // data-hiding : encapsulation
    private final String name;
    private final int sizeInBytes;

    final FileMetaData fileMetaData;
    public File (String n, int sz, FileMetaData fileMetaData){
        name = n;
        sizeInBytes = sz;
        this.fileMetaData = fileMetaData;
    }

    // demonstrate the usage of 'this' keyword
    public boolean cmp(File f){
        return this.name.equals(f.name) && this.sizeInBytes == f.sizeInBytes && this.fileMetaData == f.fileMetaData;
    }
}