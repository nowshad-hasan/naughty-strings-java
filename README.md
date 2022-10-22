# Naughty-Strings Java
Java API for the [Big List of Naughty Strings](https://github.com/minimaxir/big-list-of-naughty-strings).

[CHANGELOG](https://github.com/nowshad-hasan/naughty-strings-java/blob/main/CHANGELOG.md) is here.
## Description
Sometimes we need to test our user input with different types of strings. It might be character, icon, emoji, SQL injection etc. This library is built to validate the user input with those **_totally uncertain_** strings. We call it **Naughty Strings**.
Some example below:<br>
Ω≈ç√∫˜µ≤≥÷ <br>
åß∂ƒ©˙∆˚¬…æ <br>
œ∑´®†¥¨ˆøπ“‘ <br>
¡™£¢∞§¶•ªº–≠ <br>
¸˛Ç◊ı˜Â¯˘¿ <br>
👨‍🦰 👨🏿‍🦰 👨‍🦱 👨🏿‍🦱 🦹🏿‍♂ <br>
;alert(123); <br>
社會科學院語學研究所 <br>
(｡◕ ∀ ◕｡) <br>

## Installation
Gradle: <br>
```
implementation 'io.github.nowshad-hasan:naughty-strings-java:1.0.1'
```
Maven: <br>
````
<dependency>
    <groupId>io.github.nowshad-hasan</groupId>
    <artifactId>naughty-strings-java</artifactId>
    <version>1.0.1</version>
</dependency>
````
Please go to [Maven Repository](https://mvnrepository.com/artifact/io.github.nowshad-hasan/naughty-strings-java) for other dependencies.
## Usage
We can use it in two ways. 

1. Get all the strings of a type
````java 
List<String> naughtyStringList = BLNS.getList(NaughtyStrings.RESERVED_STRINGS);
````

If we want all the naughty strings, then we must pass the enum `NaughtyStrings.ALL`.

2. Get custom size, random strings of a type

````java 
List<String> randomNaughtyStringList = BLNS.getRandomList(10, NaughtyStrings.NUMERIC_STRINGS);
````
We have to pass `NaughtyStrings.ALL` to get the random custom size list from all the naughty strings.

## Contribution

Please feel free to contribute in this project, by solving any critical issue, typo, 
code-structure improvement etc. 
Open an issue [here](https://github.com/nowshad-hasan/naughty-strings-java/issues/new) with description, screenshot and anything you need.  

Pull Requests are most welcome. Read the guide from [opensource.com](https://opensource.com/article/19/7/create-pull-request-github) 
or [GitHub docs](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request)
and make a PR with your desired code. We will definitely look into it. 


