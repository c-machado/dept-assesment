# dept-assessment
Automated test of the Github repository creation process.

TestSuite to complete the process of creation and deletion of a Github repository.
This project has been built using Java, Cucumber, Selenium and TestNG. All the expected behaviours have been documented using the Gherkin language. 

## Prerequisites
In order to run this this site you'll be needing:
1. Latest version of Java (v.11.0.2)
1. Latest version of Maven to build and run the suite (v.3.6.0)

If you're unsure which Java version you have in your machine, please run
the following command in your terminal: 
```
$ java -version 
```
Same goes for maven
```
$ mvn -v 
```
If your Java or Maven are outdated or you don't have them in your machine, 
you can always install or update them via Homebrew,
using the following commands

```
$ brew cask install java 
$ brew install maven
```

## How to run this suite?
1. Clone this [repository](https://github.com/c-machado/dept-assessment) on your local machine
1. Navigate to **dept-assessment** folder in your terminal
1. Run the following command:
```
mvn clean install test -DsuiteXmlFile=testng.xml 
```
4. If you've already run it for the first time, and want to run it again, you
just need to run this command:
```
mvn test -DsuiteXmlFile=testng.xml 
```

## Any troubles?

If you run into any issues while trying to run this suite please feel 
free to contact me to **dcmachadou@gmail.com**, I'll be happy to take a look at it.   

Thank you! 
:sunglasses: