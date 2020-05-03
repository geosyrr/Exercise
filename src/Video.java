public  class Video extends MediaFile {
        private String video;

    public Video(String fileName, int bytes, String type){
        super(fileName, bytes, type);
        this.video = video;

    }



    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Video{" +
                "video='" + video + '\'' +
                '}';
    }
}


