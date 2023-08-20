public class File {
    // data-hiding : encapsulation
    private String name;
    private int sizeInBytes;

    private static int count = 0;

    // Constructor
    public File(String name, int sizeInBytes) {
        this.name = name;
        if (sizeInBytes <= 0)
            throw new RuntimeException ("illegal size");
        this.sizeInBytes = sizeInBytes;
        count++;
    }


    // Getters
    public String getName() {
        return name;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty())
            // throw exception
        // verification check
        {
            this.name = name;
        }
    }

    public void setSizeInBytes(int sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
}
