import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayList {

    private ArrayList<MediaFile> playList = new ArrayList<>();

    public void addMedia( MediaFile media){
        playList.add(media);
    }

    public void removeMedia(int index){
        if (index>=0 && index < playList.size()){
            playList.remove(index);
        }
    }

    public void savePlayList(String filename) {

        try {
            PrintWriter printWriter = new PrintWriter(new File(filename));
            for (MediaFile m : playList) {
                printWriter.println(m.getFileName() + "," + m.getBytes()
                        + "," + m.getType());

            }
            printWriter.close();
        } catch (FileNotFoundException f) {
            System.out.println("The PlayList cannot be saved");
        }
    }
        public void loadPlayList(String filename){
            playList.clear();
            try{
                Scanner scanner = new Scanner(new File(filename));
                while (scanner.hasNextLine());
                    String line = scanner.nextLine();
                    String[] words = line.split(",");
                    MediaFile media = new MediaFile(
                            words[0],
                            words[1],
                            Integer.parseInt(words[2]));
                            playList.add(media);
                }
                catch (Exception e){
            }
        }

}
