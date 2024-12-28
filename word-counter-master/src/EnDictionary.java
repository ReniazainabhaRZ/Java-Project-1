/*
*
* Copyright (c) 2015. Nexar Inc. - All Rights Reserved. Proprietary and confidential.
*
* Unauthorized copying of this file, via any medium is strictly prohibited.
*
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class EnDictionary {

  public static Set<String> load() throws IOException {
    URL website = new URL("https://raw.githubusercontent.com/dwyl/english-words/master/words.txt");
    ReadableByteChannel rbc = Channels.newChannel(website.openStream());

    // download words
    Path tmpPath = Files.createTempFile("words", ".txt");
    try (FileOutputStream fos = new FileOutputStream(tmpPath.toFile())){
      fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }

    // prepare result
    HashSet<String> res = new HashSet<>(Files.readAllLines(tmpPath));
    Files.deleteIfExists(tmpPath);
    return res;
  }
}