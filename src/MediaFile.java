public class MediaFile {


    private String name;
    private int bytes;
    private String type;

    public MediaFile(String word, String word1, int parseInt) {

    }

    public String getFileName() {
        return name;

    }

    public void setFilename(String fileName) {
        this.name = fileName;
    }

    public float getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MediaFile(String fileName, int bytes, String type) {
        this.name = fileName;
        this.type = type;
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "filename='" + name + '\'' +
                ", bytes=" + bytes +
                ", type='" + type + '\'' +
                '}';
    }
}
