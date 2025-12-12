import java.awt.Color;

public class Editor4 {
    public static void main(String[] args) {
        String fileName = args[0];
        int n = Integer.parseInt(args[1]);

        Color [][]inPic = Runigram.read(fileName);
        Color [][]outPic = Runigram.grayScaled(inPic);

        Runigram.setCanvas(inPic);
        Runigram.morph(inPic, outPic, n);
    }
}
