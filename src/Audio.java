public  class Audio extends MediaFile{
    private String audio;

    public Audio(String fileName, int bytes, String type){
        super(fileName, bytes, type);
        this.audio = audio;

    }

    public String getVideo() {
        return audio;
    }

    public void setVideo(String video) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "audio='" + audio + '\'' +
                '}';
    }
}
