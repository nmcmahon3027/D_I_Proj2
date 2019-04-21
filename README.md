# D_I_Proj2_NEW
Project 2 Fixes:

Here are the points in the program that I tried to re-work via your feedback and notes:

 One big note is that due to the fact that our original Project 2 became so tangled and coupled, I decided to create an entirely new iteration from scratch using the same basic structure and principles of the original Apartment Finder program. I contacted you on Piazza pointing out some of the questions that I encountered while making the fixes. 

The main reason I wanted to start fresh was to re build the module/packages for better readability and extensibility. It also made the possibility of adding the Dependency Inversion Principle easier. I had a lot of questions regarding how I used it. I did a lot of research and I hope that I did it correctly. My main questions were with the xml config file and the dependency inversion that was lacking in the first version. I created a stronger three tier structure with more smaller packages/modules inside those. 

I cut a lot of the fat from the older one and now all the classes should be easier to see in the files. I have added interfaces to each layer so it can directly “talk” with the corresponding module. This also solves the issue I had before of heavy coupling—the policy (or dal) can communicate to the abstract interface for the middle layer (model). These were all my main goals and I hope I did them correctly. I also used some of the visitor pattern in this updated program as well, since I learned it was a great feature in Project 4. 

I did a lot of work with the xml (spring config file) too. The program only contains one spring config file now instead of one for each package. There are now multiple beans inside the config file as well as some additional ones like provided in the example from class.  

I hope these changes help with the guidelines. Please let me know if you have questions
