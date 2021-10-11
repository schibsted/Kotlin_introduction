# Tasks

## task 1 - hello world
Create and run a hello world application. 

- Documentation [mainFunction.kts](1Intro-howToRun/mainFunction.kts)

## task 2 - Create data class

Create a class structure for a dictionary that, at a minimum, should be able to store an arbitrary number of words along with the language of each word.

- Documentation [3PlayWhitDataClasses.kts](3DataClasses/3PlayWhitDataClasses.kts)

Example implementation could found in the bottom of [this file](3DataClasses/Task.kts)

## task 4 - Null

### First use given code below and print the brand name nullsafe
As extra try to instead print "non" if it is null
```kotlin
  data class Brand (val name:String)
  data class Car (val brand:Brand?)
  val car = Car(null)
```
### Second get a nullPointerException
The task is to use the given code and to get a nullPointerException. As to test how Kotlin handles null

- Documentation [4NullAndTypes.kts](4NullAndTypes/4NullAndTypes.kts)

Example implementation could found in the bottom of [this file](4NullAndTypes/Task.kts)


## task 5 lists 

### task one:
Write a function that takes a list of Int and adds 2 to every element and returns it
as this (4, 5, 2, 4, 3, 5, 3) to this: (6, 7, 4, 6, 5, 7, 5)

### task two:
Write a function that takes a list of Int and prints the values that are bigger than 25

### task tre:
Write a function that takes a list of numbers and outputs ***how many*** numbers occurred more than once

- Documentation [Streams.kts](5StreamsAndList/Streams.kts)

Example implementation could found in the bottom of [this file](5StreamsAndList/Tasks.kts)

## Extra 6

Se file [this](6Extra/Task.kts)
