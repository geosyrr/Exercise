public class Image extends MediaFile{


    private String image;

    public Image(String fileName, int bytes, String type){
        super(fileName, bytes, type);
        this.image = image;
    }

    public String getVideo() {
        return image;
    }

    public void setVideo(String video) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "audio='" + image + '\'' +
                '}';
    }
}