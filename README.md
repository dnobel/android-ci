Android CI Sample Project
=========================

Shows how to configure a CI build for Android apps using maven, gradle, different testing and analysis tools. This project was demonstrated as a demo for a talk about Continuous Integration at mobile cologne (http://www.mobilecologne.de/) on the 11. of July 2013.

Please have also a look at https://github.com/stephanenicolas/Quality-Tools-for-Android which provides a larger set of quality and automation tools around Android.

**Included build tool examples:**

* Maven
* Gradle

**Included testing tool examples:**

* Roboeletric
* Robotium

**Included static analysis tool examples:**

* Lint
* PMD
* findbugs

Prerequisites
-------------

You should have installed the following tools:

* Android SDK with platform 17 (4.2.2)
* Environment variable ANDROID_HOME should point to the installed SDK
* Maven3
* Android platform 17 must be deployed in the local maven repository (see https://github.com/mosabua/maven-android-sdk-deployer)
* git for checking out the project
* Gradle (only for the gradle example)

For use with Eclipse you must have installed

* Eclipse Juno or newer
* Latest m2e plugin
* Latest m2e Android connector (http://rgladwell.github.io/m2e-android/)

How to Use
----------

Checkout git project:

> git checkout https://github.com/dnobel/android-ci.git
> cd android-ci


Building the app and run unit tests (without UI tests):
 
> mvn install -PskipUiTests

Building the app and execute PMD and findbugs analysis:
 
> mvn install -PskipUiTests -Panalyze

Building the app and execute unit and UI tests (emulator or device must be connected to the ADB):
 
> mvn install
