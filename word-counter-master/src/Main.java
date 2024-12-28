/*
*
* Copyright (c) 2015. Nexar Inc. - All Rights Reserved. Proprietary and confidential.
*
* Unauthorized copying of this file, via any medium is strictly prohibited.
*
*/

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        // load vocabulary and urls from file
        Set<String> vocabulary = EnDictionary.load();
        List<String> urls = EngadgetAddresses.load();

        //TODO: Find the number of occurrences of each word in the vocabulary and print the result.
    }
}
