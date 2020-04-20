Topic Modeller Assignment
Object Oriented Programming CMPU2016
Markus Baciu(C18350801)
GitHub Link:  https://github.com/mbaciu73/Java/tree/master/Assignment
This readme file will also be included in the repository
------------------
Control Class - 
Creates an object for Screen which defines the Title "Topic Modeller"
Also allows the class to run

Screen Class-
Creates a GUI for the user. It is created with buttons,labels and texfields and is displayed on its corresponding side depending on which file the question is about.
Allows allows for errors to be entered and allow the user to try again if an error is entered. It then goes into the Files class to open the files which were entered
and then displays the result from the Words class when a comparison is done

Files Class-
locates the files entered into the constructor and displays errors if file is not found. Opens file when needed

stopWords Class-
Takes data from the url provided and splits the data until the words are collected into a long string and split into a char array. 
Indexes for the beginning of each word is sought and set into an arrayand iterates until that number is found to set it to uppercase. After converted back to a string,
it splits it from the uppercase letter and allows the finished words to be displayed into an array. Allows access to any class who calls an object with the function
to display the finished words in the array

Comparison class - 
Compares the 2 files entered into the count function and counts the number of times a word is repeated throughout the other file.
It continues on if a word is a stop word.
displays the percentage of the like that they are similar and the number of words that are similar

----------------------

If I has more time, I would spend less time on stopWords as I spent most of my time working on the algorithm aspect rather than the executional aspect of the program
I would give myself more time in features that I could add in order to make it more enticing and attractive. Also find other ways to display the GUI without using borderlayout()
all the time. What I did learn was that time is money and that if you do a program a day before or today, it can really affect the finished product.

!!The Bin folder contains the classes while the src contains the source codes!!
