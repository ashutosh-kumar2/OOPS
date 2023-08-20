import java.util.Date;

public class FileMetaData {

    Date createdOn;
    Date modifiedOn;

    int version;
    public FileMetaData(Date createdOn, Date modifiedOn, int version) {
        this.createdOn = createdOn;
        this.modifiedOn = modifiedOn;
        this.version = version;
    }
}
