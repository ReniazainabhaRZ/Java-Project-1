Website Vocabulary Analyzer Test
================================

Hello! Welcome!

In this test you are required to write a java program that counts the number of occurrences of certain words in a group of websites.


Input
=====
* 'vocabulary' - A vocabulary of predefined words. Those are the only words that we are interested in counting.

* 'urls' - A list of URLs to html pages.


Goal
====
Fetch each of the pages from the web, count the number of occurrences of each word from the dictionary in them, and print out the results.


Gotchas
=======
* We are only interested in full-word match. No need to look for partial or fuzzy matches.

* To make things easier, you do not have to distinguish between the html structure and body. You can treat the entire html as a text document.

* Your code should be clean and well organized.

* The list of urls is fairly long, which could cause the program to run for a long time. Eventually, we'd like for you to try and make it run as fast as possible.


Code Structure
==============
* Main.java - the entry point for the program, and the class you should be running. Main already initializes the input params (vocabulary and urls).

* EnDictionary.java / EngadgetAddresses.java - classes responsible for loading the vocabulary and the urls list. These are help classes which you can probably disregard.
