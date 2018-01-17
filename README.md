This is how I have my environment setup. I figured I would lay it out so we can talk about it tomorrow and see if its the direction we want to take the project or if we want to try it a different way that may be less work up front.

I tested everything in a clean windows VM so it should work for everyone.

# Windows
## Dependency Installation
I'm on windows and use chocolatey to install packages
https://chocolatey.org/install

1) In an administrative cmd:
    `
    @"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"
    `

2) Close and open an new admin cmd window

3) Install project dependencies

     `choco install -y jre8 jdk8 intellijidea-ultimate git`
4) Download glassfish 5 full platform and extract to C:\
    http://download.oracle.com/glassfish/5.0/release/glassfish-5.0.zip
    * glassfish should be located at C:\glassfish5 now
    * IntelliJ should show GlassFish 


## Git Configuration
Setup git so that your commits are tracked and so you can get recognition in for activity on github

`git config --global user.name "Your Name"`

`git config --global user.email "email@example.com"`

## IntelliJ Setup
1) Open IntelliJ IDEA
2) Login with your JetBrains student account
3) You can accept all defaults for the rest "Skip Remaining and Set Defaults"
4) In the Welcome to IntelliJ IDEA window, choose Configure down at the bottom, -> settings -> Build, Execution, Deployment -> Application Servers
5) Click the + to add a new Glassfish server
    * Use C:\glassfish5 as your glassfish home directory
    * IntelliJ should show GlassFish Version 5.0.0
    * Click OK to close out
6) Configure the Java JDK by going Configure -> Project Defaults -> Project Structure
7) Under Project SDK click New... -> JDK
    * Mine is at C:\Program Files\Java\jdk1.8.0_162

## Import Project
