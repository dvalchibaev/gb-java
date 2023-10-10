package gb_apps;
import java.util.ArrayList;
import java.util.List;

public class App4 {
  public static void main(String[] args) {
    Msg m = new ContentMsg();
    if (m instanceof ContentMsg) {

    } else if (m instanceof Msg) {

    }
  }
}

class Msg {
  String text;
}

class Document {

}

class AudioMsg extends Document {
}

class VideoMsg extends Document {
}

class ContentMsg extends Msg {
  ArrayList<Document> content = new ArrayList<>();
}