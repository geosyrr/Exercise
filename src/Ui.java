import java.sql.SQLOutput;
import java.util.Scanner;

public class Ui {
    public Choice list() {
        Choice returnChoice;
        System.out.println("1) Add media into PlayList   "
                + "2) Remove media from PlayList   "
                + "3) Save your favorite PlayList   "+ "4) Load my favorite PlayList");
        int choice;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    return Choice.ADD;
                case 2:
                    return Choice.REMOVE;
                case 3:
                    return Choice.SAVE;
                case 4:
                    return Choice.LOAD;
                case 0:
                    return Choice.EXIT;
                default:
                    return Choice.ERROR;
            }
        } catch (Exception e) {
            return Choice.ERROR;
        }
    }

    public MediaFile createMedia() {
        String name;
        String type;
        int bytes;
        String video;
        String audio;
        String image;
        int mediaType;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. for video, 2.for audio, 3. for image");
        mediaType = scanner.nextInt();
        System.out.println("Give media name ");
        name = scanner.next();
        System.out.println("Give media type ");
        type = scanner.next();
        System.out.println("Give media bytes ");
        bytes = scanner.nextInt();

        MediaFile media;

        switch (mediaType) {
            case 1:
                System.out.println("Give me a video name ");
                audio = scanner.next();
                media = new Video(name,  bytes, type);
                return media;
            case 2:
                System.out.println("Give me an audio name ");
                video = scanner.next();
                media = new Audio(name, bytes, type);
                return media;
            case 3:
                System.out.println("Give me an image name ");
                image = scanner.next();
                media = new Image(name, bytes, type);
                return media;
            default:
                return null;
        }
    }

    public void managePlayList(PlayList mediaList) {
        Choice choice;
        do {
            choice = list();
            switch (choice) {
                case ADD:
                    MediaFile media = createMedia();
                    mediaList.addMedia(media);
                    break;
                case REMOVE:
                    System.out.println("Give an index to remove");
                    Scanner scanner = new Scanner(System.in);
                    int index = scanner.nextInt();
                    mediaList.removeMedia(index);
                    break;
                case SAVE:
                    mediaList.savePlayList("playlist.txt");
                    break;
                case LOAD:
                    mediaList.loadPlayList("playlist.txt");
                case ERROR:
                    System.out.println("Invalid Input");
                    break;
                case EXIT:
                    break;
            }
        }
        while (choice != Choice.EXIT);
    }

}

