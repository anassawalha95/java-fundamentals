# java-fundamentals

### Basics Lab 01

1. method `pluralize(<string word>)` accept a word and number and returns the word concatinated with S for > 1

2. method `flipNHeads(<int number>)` accept one number returns the count of random times of flipping a coin until it reaches the N number given of heads

3. method `clock()` return the exact time and kept running and printing the time for each second

### Basics Libarary Lab 02

**This Project includes a java library with its unit testing on jUnit**

###### methods thats included

- all the moethod is static and can be overrided the class name library

1. ` roll(<int number >)` recive a number and roll a dice for the number provided, returns an array of random numbers generated

2. ` containsDuplicates(<array of int>)` checks for the dupicates in array if

3.`calculateAverages(<array of int>) ` takes an array of integars and return the avarage of it

4. `calculateAveragesOfWeeklyLowestTemperature(<int[][] array>)` recives an array of integars and calculate the lowest avarage for the fo first diminsion of the array and returns its value


### Basics Libarary & linter Lab 03

**This Project include updates on the  java library adding more functionallity also it has  javascript linter for semicolons**

- all the moethod is static and can be overrided the class name library

1. `javascriptLinter(<String File Pathe>)`: takes an js file checks for semicolons at the end return nothing if each sentence has its semicolon written at the end, otherwise it return the line number with missing semicolon statment 

2. `analyzingWeatherData (<int[][]>) ` takes a 2 dimentional array search for the heighest and the lowest tempertures then checks for the tempertures that didn't show up and return  them  as string 

3. `tally (<List<String>>)`: takes a list of votes and returns the highest votes 


###  inheritance Lab 6 

**This Project Is built for Resturent Reviews, shop review, and theater review where the users can rate any resturent,shop, and theater the like**

- The library has four classes (Resturant, Review , Shop, and Theater) and one interface ResturantInterface

**Methods**

1. Resturant Class:
    1. `getName()`

    2. ` setName(String name)`

    3. `getStarsRating() `

    4. `setStarsRating(double starsRating)`

    5. `addReview (Review review)`

    6. `toString()`

2. Shop Class:
   
    1. `getName()`

    2. `setName(String name)`

    3. `getDescription()`

    4. `setDescription(String description)`

    5. `getNumOfDollerSign()`

    6. `addReview (Review review)`

    7. `toString()` 

    
3.  Theater Class:

    1. `getName()`

    2. `setName(String name)`

    3. `getMovies()`

    4. `setMovie(String movie) `

    5. `addReview (Review review)`

    6. `toString()`

4. Review Class:

    1. `getName()`

    2. `setName(String name)`

    3. `getBody()`

    4. `setBody(String body)`

    5. `getAuthor() `

    6. `setAuthor(String author)`

    7. `getStarsRating() `

    8. `setStarsRating(double starsRating)`

    9. `toString()`
