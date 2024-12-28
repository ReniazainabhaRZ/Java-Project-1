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
import java.util.List;

public class EngadgetAddresses {

  public static List<String> load() throws IOException {
    URL file = new URL("https://s3-us-west-2.amazonaws.com/nx-dana/inter-test/endg-urls");
    ReadableByteChannel rbc = Channels.newChannel(file.openStream());

    // download words
    Path tmpPath = Files.createTempFile("urls", ".txt");
    try (FileOutputStream fos = new FileOutputStream(tmpPath.toFile())){
      fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }

    // prepare result
    List<String> res = Files.readAllLines(tmpPath);
    Files.deleteIfExists(tmpPath);
    return res;
  }
}
